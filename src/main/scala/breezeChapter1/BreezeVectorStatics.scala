package breezeChapter1

import breeze.linalg.{DenseVector, max}
import breeze.stats.{meanAndVariance, stddev}
import breeze.numerics._

object BreezeVectorStatics extends App{
  def eje1()={
    val evenNotsTill20Double: DenseVector[Double] =DenseVector[Double](0,20,2)
    //devolver una tupla de la media y la varianza del vector evenNotsTill20Double
  }

  def eje2()= {
    val evenNotsTill20Double: DenseVector[Double] = DenseVector[Double](0, 20, 2)
    //devolver el valor maximo en el vector evenNotsTill20Double
  }

  def eje3()={
    val evenNotsTill20Double: DenseVector[Double] = DenseVector[Double](0, 20, 2)
    //devolver una tupla aplicando a el vector raiz y logaritmo 10
  }

}
