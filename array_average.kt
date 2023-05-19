fun main()
{
    var array= intArrayOf(35,56,45,67,78)

    var n=array.size

    var sum =0
    for(i in array)
    {
        sum=sum+i
    }

    print("Average of array =${sum.toDouble()/n}")

}