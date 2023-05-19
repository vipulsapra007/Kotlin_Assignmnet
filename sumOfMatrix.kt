fun main() {
    var row = 2
    var column = 3
    var matrix1 = Array(row) { IntArray(column) }
    var matrix2 = Array(row) { IntArray(column) }
    var sum = Array(row) { IntArray(column) }

    println("Enter Matirx 1 Elements=")
    for (i in 0 until row) {
        for (j in 0 until column) {
            matrix1[i][j] = readLine()!!.toInt()
        }
    }

    println("Enter Matrix 2 Elements=")

    for (i in 0 until row) {
        for (j in 0 until column) {
            matrix2[i][j] = readLine()!!.toInt()
        }
    }


    for (i in 0 until row) {
        for (j in 0 until column) {
            sum[i][j] = matrix1[i][j] + matrix2[i][j]
        }
    }
    println("Sum of Matrix=")

    for (row in sum) {
        for (elements in row) {

            print("$elements\t")

        }
        println()

    }


}

