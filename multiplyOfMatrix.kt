fun main() {
    var row = 2
    var column = 3
    var matrix1 = Array(row) { IntArray(column) }
    var matrix2 = Array(row) { IntArray(column) }
    var multiplication = Array(row) { IntArray(column) }

    println("Enter Matrix 1 elements")
    for (i in 0 until row) {
        for (j in 0 until column) {
            matrix1[i][j] = readLine()!!.toInt()
        }
    }
    println("Enter Matrix 2 elements")
    for (i in 0 until row) {
        for (j in 0 until column) {
            matrix2[i][j] = readLine()!!.toInt()
        }
    }

    for(i in 0 until row)
    {
        for(j in 0 until column)
        {
            multiplication[i][j]= matrix1[i][j]*matrix2[i][j]
        }
    }

    println("Multiplication of Matrix")
    for (row in multiplication)
    {
        for (elements in row)
        {
            print("$elements\t")
        }
        println()
    }

}

