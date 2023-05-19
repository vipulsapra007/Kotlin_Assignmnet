fun main()
{
    print ("enter which table do you want=")
    var a= readLine()!!.toInt()

    for(i in 1..10)
    {
        print("$a*$i = ${a*i}")
        println()
    }
}