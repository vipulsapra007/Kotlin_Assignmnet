fun main()
{
    print("enter string=")
    var string= readLine()!!


    println()

    for(i in 0 until string.length)
    {
        var frequency=string!![i].toInt()
        println("frequency of ${string!![i]}=$frequency")
    }


}