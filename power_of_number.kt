fun main() {
    print("enter number =")
    var Num1 = readLine()!!.toInt()

    print("enter power=")
    var Pow1 = readLine()!!.toInt()

    var power = Num1
    for (i in 2..Pow1)
    {
        power = power * Num1

    }
    print(power)
}