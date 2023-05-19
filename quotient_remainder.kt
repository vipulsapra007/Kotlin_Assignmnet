fun main()
{
    print("enter value of A=")
    var a= readLine()!!.toInt()
    print("enter value of B=")
    var b= readLine()!!.toInt()

    println("Remainder =${a%b} Quotient=${a/b.toFloat()}")

}