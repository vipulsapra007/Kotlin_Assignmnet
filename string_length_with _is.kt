fun main()
{
    print("enter string=")
    var str= readLine()!!

    if(str is String)
    {
        print("Length of string =${str.length}")
    }
    else
    {
        print("Its Not a String")
    }
}