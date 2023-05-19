fun factorial(n:Int):Int
{
    return if(n==0||n==1)
    {
        1
    }
    else{

       n*factorial(n-1)
    }

}
fun main()
{
    print("Enter Nubmer=")
    var Num= readLine()!!.toInt()

    print("Factorial of $Num=${factorial(Num)}")
}