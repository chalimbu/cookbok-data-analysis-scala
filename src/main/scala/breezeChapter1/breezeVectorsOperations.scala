package breezeChapter1

import breeze.linalg._

object breezeVectorsOperations extends App{
  val vectorSum: DenseVector[Double] = DenseVector.tabulate[Double](5)(index=>index*2)
  println(s"${vectorSum +10.0}")

  val multiplicacionPunto= vectorSum.dot(DenseVector.fill[Double](5,2))
  println(s"$multiplicacionPunto")

  val justFive2s=DenseVector.fill(5, 2)
  val zeroThrough4=DenseVector.range(0, 5, 1)
  val concatVector: DenseVector[Int] =DenseVector.vertcat(zeroThrough4, justFive2s)

  val concatVector2= DenseVector.horzcat(zeroThrough4,justFive2s)
  println(concatVector2)

  val fromIntToDouble= breeze.linalg.convert(concatVector,Double)
  println(s"$fromIntToDouble")
}
