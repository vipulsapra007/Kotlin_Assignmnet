fun main()
{
    print("enter value of variable 1=")
    var a= readLine()!!.toInt()
    print("enter value of variable 2=")
    var b= readLine()!!.toInt()
    print("enter value of variable 3=")
    var c= readLine()!!.toInt()

    if(a>b)
    {

        if(a>c)
        {
            print("$a is Greater")
        }
    }
    else if(b>c)
    {
        print("$b is greater")
    }
    else
    {
        print("$c is Greater")
    }

}