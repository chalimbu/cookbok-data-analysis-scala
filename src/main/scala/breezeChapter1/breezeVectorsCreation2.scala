package breezeChapter1

import breeze.linalg._

object breezeVectorsCreation2 extends App{
 val spaceVector: DenseVector[Double] =breeze.linalg.linspace(2, 10, 5)
 val rangeD= DenseVector.rangeD(0,10,0.5)

 val howBig= DenseVector.fill(10,2)

 val slice= howBig.slice(2,6)
}
