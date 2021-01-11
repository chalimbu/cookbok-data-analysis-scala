package breezeChapter1

import breeze.linalg._

object breezeVectorsOperations extends App{

  def eje1()={
    val vectorSum: DenseVector[Double] = DenseVector.tabulate[Double](5)(index=>index*2)
    //retornar: sumarle 10 escalarmente al vector vectorSum
    vectorSum +10.0
  }

  def eje2()={
    // a.b = sum i=i a n de ai * bi
    val vectorA: DenseVector[Double] = DenseVector.tabulate[Double](5)(index=>index*2)
    val vectorB = DenseVector.fill[Double](5,2)
    //retornar: la multiplicion punto del vecto a y b
    vectorA.dot(vectorB)
  }

  def eje3()= {
    val evenNosTill20= DenseVector.range(0,20,2) //DenseVector(0,2,4,6,8,10,12,14,16,18)
    val denseJus2= DenseVector.fill(10,2) // DenseVector(2,2,2,2,2,2,2,2,2,2)
    //retornar un vector que sea DenseVector(2,4,6,8,10,12,14,16,18.20)
    evenNosTill20 +denseJus2
  }

  def eje4()={
    val evenNosTill5= DenseVector.range(0,4,2) //DenseVector(0,2)
    val denseJus2= DenseVector.fill(2,2) // DenseVector(2,2)
    // retornar tupla concatenando los vector vertical (uno despues del otro) y horizonta uno al lado del otro
    (DenseVector.vertcat(evenNosTill5,denseJus2),DenseVector.horzcat(evenNosTill5,denseJus2))
  }

  def eje5()={
    val denseJust2: DenseVector[Int] = DenseVector.fill(4,2)
    // retornar el denseJust pero con tipo Double
    breeze.linalg.convert(denseJust2,Double)
  }


}
