fun main()
{
    var array= intArrayOf(13,45,56,76,44)
    var max=0
    for(i in array)
    {

        if(i>max)
        {
            max=i
        }

    }
    print("Largest Element =$max")
}