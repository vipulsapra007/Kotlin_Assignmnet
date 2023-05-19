fun main()
{
    print("enter number for finding factors=")
    var Num1= readLine()!!.toInt()
    print("factors of $Num1  =")
    for(i in 1..Num1)
    {
        if(Num1%i==0)
        {
            print("\t$i")
        }

    }
}