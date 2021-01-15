package breezeChapter

import breeze.linalg.DenseMatrix
import breezeChapter1.BreezeMatricesCreation
import org.scalatest.funsuite.AnyFunSuite

class BreezeMatricesCreationTest extends AnyFunSuite{

  test("prueba la creacion de matrices"){
    val data= List(1,2,3,4,5,6).toArray
    assert(BreezeMatricesCreation.eje1==DenseMatrix((1,2,3),(11,12,13),(21,22,23)))
    assert(BreezeMatricesCreation.eje2()==DenseMatrix.zeros[Double](2,3))
    assert(BreezeMatricesCreation.eje3()==DenseMatrix.tabulate[Double](3,3)((file,colum)=>{file*colum}))
    assert(BreezeMatricesCreation.eje4()==DenseMatrix.eye[Double](4))
    assert(BreezeMatricesCreation.eje5().rows==2)
    assert(BreezeMatricesCreation.eje5().cols==3)
    assert(BreezeMatricesCreation.eje6()==(new DenseMatrix(2,2,data)))

  }

}
