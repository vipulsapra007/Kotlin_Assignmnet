fun main() {
    print("Enter Number 1=")
    var Num1 = readLine()!!.toInt()
    print("Enter Number 2=")
    var Num2 = readLine()!!.toInt()

    var x = Num1
    var y = Num2

    while (Num2 != 0) {
        val G = Num1 % Num2
        Num1 = Num2
        Num2 = G
    }
    print("LCM is =${(x * y) / Num1}")
}