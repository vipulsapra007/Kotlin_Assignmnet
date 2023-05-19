fun main()
{
    print("enter Year=")
    var year= readLine()!!.toInt()

    if(((year%4==0)&&(year%100!=0))||(year%400==0))
    {
        print("Its Leap Year")
    }
    else
    {
        print("Its Not a Leap Year")
    }
}