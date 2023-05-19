fun primeNumber(i:Int)
{
    if(i==2||i==3||i==5||i==7)
    {
        print("\t$i")
    }
    else if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0))
    {
        print("\t$i")
    }
    else{}
}
fun main()
{
    print("Enter Start=")
    var Num1= readLine()!!.toInt()
    print("Enter Start=")
    var Num2= readLine()!!.toInt()

    for(i in Num1..Num2)
    {
        primeNumber(i)
    }

}
