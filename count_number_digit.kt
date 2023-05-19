fun main() {
    print("Enter number=")
    var Num1 = readLine()!!.toInt()

    var count = 0
    while (Num1 > 0) {

        Num1 /= 10
        count++

    }
    print("Digits =$count")
}