fun main()
{
    print("enter value of A=")
    var a= readLine()!!.toInt()
    print("enter value of B=")
    var b= readLine()!!.toInt()

    println("before swapping a=$a & b=$b")
    a=a+b
    b=a-b
    a=a-b

    println("after swapping a=$a & b=$b")

}