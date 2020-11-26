package breezeChapter

import breeze.linalg.{DenseVector, SparseVector, linspace}
import breezeChapter1.{BreezeVectorsCreation, BreezeVectorsCreation2}
import org.scalatest.funsuite.AnyFunSuite

class BreezeVectorCreation2Test extends AnyFunSuite{
    test("retornos de funciones para el ejercisio 1"){
     val A=DenseVector.fill(10,2)
     assert(BreezeVectorsCreation2.eje1()==linspace(2, 10, 5))
      assert(BreezeVectorsCreation2.eje2()==DenseVector.rangeD(0,10,1.5))
      assert(BreezeVectorsCreation2.eje3()==DenseVector.fill(10,2))
      assert(BreezeVectorsCreation2.eje4()== A.slice(1,5))
    }
}
