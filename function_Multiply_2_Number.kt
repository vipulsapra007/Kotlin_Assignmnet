fun Multiply(Num1: Int, Num2: Int) {
    if (Num1 == 0) {
        print("$Num1 is Null")
    } else if (Num2 == 0) {
        print("$Num2 is Null")
    } else {
        print("Multiplication of $Num1 and $Num2=${Num1 * Num2}")
    }
}
fun main()
{
    print("Enter Number=")
    var X= readLine()!!.toInt()
    print("Enter Number=")
    var Y= readLine()!!.toInt()

    Multiply(X,Y)
}