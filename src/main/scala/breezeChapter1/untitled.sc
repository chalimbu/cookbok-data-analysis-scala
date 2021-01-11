import breeze.linalg.DenseVector

DenseVector.range(0,4,2) //DenseVector(0,2)
DenseVector.fill(2,2) // DenseVector(2,2)
// retornar tupla concatenando los vector vertical (uno despues del otro) y horizonta uno al lado del otro
//(DenseVector.vertcat(evenNosTill5,denseJus2),DenseVector.horzcat(evenNosTill5,denseJus2))