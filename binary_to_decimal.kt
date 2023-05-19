fun binaryTOdecimal(Num: Long): Int {
    var Num = Num
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (Num.toInt() != 0) {
        remainder = Num % 10
        Num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        i++

    }
    return decimalNumber
}


fun main() {
    print("Enter Binary Number=")
    var Num = readLine()!!.toLong()

print(binaryTOdecimal(Num))
}
