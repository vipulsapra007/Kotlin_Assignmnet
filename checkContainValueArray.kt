fun main() {
    print("Enter Array Size=")
    var size = readLine()!!.toInt()

    var Array1 = IntArray(size)

    for (i in 0 until size) {
        print("Enter Array Numbers=")
        Array1[i] = readLine()!!.toInt()
    }

    print("Enter value to check in array=")
    var value = readLine()!!.toInt()

    print("Array contain $value=${Array1.contains(value)}")


}