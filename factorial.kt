fun main()
{
    print ("enter which table do you want=")
    var a= readLine()!!.toInt()
    var fact=1

    for(i in 1..a)
    {
        fact=fact*i

    }
    print("factorial =$fact")
}