fun main() {
    var row = 2
    var column = 2


    var Matrix1 = Array(row) { IntArray(column) }
    var Matrix2 = Array(row) { IntArray(column) }
    for (i in 0 until row) {
        for (j in 0 until column) {
            print("Enter Matrix 1 elements=")
            Matrix1[i][j] = readLine()!!.toInt()
        }
    }
    for (i in 0 until row) {
        for (j in 0 until column) {
            print("Enter Matrix 2 elements=")
            Matrix2[i][j] = readLine()!!.toInt()
        }
    }
    var resultMatrix = MultiplicationMatrix(row, column, Matrix1, Matrix2)

    print("Matrix After Multiplication\n")
    for (i in 0 until row) {
        for (j in 0 until column) {
            print(resultMatrix[i][j])
            print("\t")
        }
        println()
    }


}

fun MultiplicationMatrix(row: Int, column: Int, Matrix1: Array<IntArray>, Matrix2: Array<IntArray>): Array<IntArray> {
    var resultMatrix = Array(row) { IntArray(column) }
    for (i in 0 until row) {
        for (j in 0 until column) {
            resultMatrix[i][j] += Matrix1[i][j] * Matrix2[i][j]
        }
    }
    return resultMatrix

}