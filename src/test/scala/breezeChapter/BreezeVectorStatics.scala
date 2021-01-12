package breezeChapter

import breeze.linalg.{DenseVector, max}
import breeze.numerics.{log, sqrt}
import breeze.stats.meanAndVariance
import breezeChapter1.BreezeVectorStatics
import org.scalatest.funsuite.AnyFunSuite

class BreezeVectorStatics extends AnyFunSuite{
  test("pruebas las estadisticas de un vector breeze"){
    val evenNotsTill20Double: DenseVector[Double] =DenseVector[Double](0,20,2)
    val mv=meanAndVariance(evenNotsTill20Double)
    assert(BreezeVectorStatics.eje1()==(mv.mean,mv.variance))
    assert(BreezeVectorStatics.eje2()==max(evenNotsTill20Double))
    assert(BreezeVectorStatics.eje3()==(sqrt(evenNotsTill20Double),log(evenNotsTill20Double)))
  }
}
