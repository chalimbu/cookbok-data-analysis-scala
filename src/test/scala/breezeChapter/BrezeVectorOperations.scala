package breezeChapter

import breeze.linalg.{DenseMatrix, DenseVector}
import breezeChapter1.breezeVectorsOperations
import org.scalatest.funsuite.AnyFunSuite

class BrezeVectorOperations extends AnyFunSuite{
  test("retorno de funciona para brezeVectorOperations"){
    assert(breezeVectorsOperations.eje1()==DenseVector(10.0, 12.0, 14.0, 16.0, 18.0))
    assert(breezeVectorsOperations.eje2()==40.0)
    assert(breezeVectorsOperations.eje3()==DenseVector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20))
    assert(breezeVectorsOperations.eje4()==(DenseVector(0,2,2,2),DenseMatrix(DenseVector(0,2),DenseVector(2,2))))
    assert(breezeVectorsOperations.eje5()==DenseVector.fill[Double](4,2.0))
  }
}
