package breezeChapter1

import breeze.linalg.DenseMatrix

object BreezeMatricesCreation extends App{

  def eje1()={
  /*crear una matriz con los valores
  1  2  3
  11 12 13
  21 22 23
  solution*/
    DenseMatrix((1,2,3),(11,12,13),(21,22,23))
   }

  def eje2()={
    //crear una matriz de 0 con 3 columnas y 2 filas
    DenseMatrix.zeros[Double](2,3)
  }

  def eje3()={
    //crear una matriz double de 3*3 apartir de la funcion filas*columnas
    DenseMatrix.tabulate[Double](3,3)((file,colum)=>{file*colum})
  }

  def eje4()={
    //crear una matriz identida de 4x4 double
    DenseMatrix.eye[Double](4)
  }

  def eje5()={
    //crear una matriz de 2x3 con numeros random entre 0 y 1
    DenseMatrix.rand(2,3)
  }

  def eje6()={
    val data= List(1,2,3,4,5,6).toArray
    //crear una matriz 2x2 con los datos de data
    new DenseMatrix(2,2,data)
  }


}
