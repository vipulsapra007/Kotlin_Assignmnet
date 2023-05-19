fun main() {
    print("Enter Size of Array=")
    var size = readLine()!!.toInt()

    var StringArray = Array(size) { "" }

    for (i in 0 until size) {
        print("Enter String ${i + 1}=")
        StringArray[i] = readLine()!!
    }
    print("String with Even Length=")
    StringArray.forEach {

        lengthEvenPrint(it)
    }
}

fun lengthEvenPrint(string: String) {

    if (string.length % 2 == 0) {

        print("$string,\t")
    }
}