package breezeChapter

import breeze.linalg.{DenseVector, SparseVector}
import breezeChapter1.BreezeVectorsCreation
import org.scalatest.funsuite.AnyFunSuite

class BreezeVectorCreationTest extends AnyFunSuite{
  ignore("retornos de funciones para el ejercisio 1"){
    val vector=DenseVector(1,2,3,4)
    val sparse= SparseVector(0,0,0,2,4)
    assert(BreezeVectorsCreation.eje1()==(sparse,vector))
    assert(BreezeVectorsCreation.eje2()==SparseVector.zeros[Boolean](5))
    assert(BreezeVectorsCreation.eje3()==DenseVector.tabulate[Double](10)(index=>index))
    assert(BreezeVectorsCreation.eje4()==DenseVector(Seq(1,2,3,4,5,6)))
  }
}
