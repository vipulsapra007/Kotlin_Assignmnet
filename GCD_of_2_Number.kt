fun main() {
    print("Enter Number 1=")
    var Num1 = readLine()!!.toInt()
    print("Enter Number 2=")
    var Num2 = readLine()!!.toInt()

    while (Num2 != 0) {
        val G = Num1 % Num2
        Num1 = Num2
        Num2 = G
    }
    print("GCD of Num1 & Num2=$Num1")


}
