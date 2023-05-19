fun sumArray(a:IntArray)
{var sum =0
    for (i in a)
    {
        sum+=i
    }
    print("Sum of array is =$sum")
}
fun main()
{
    var array= intArrayOf(1,2,4,5,6,7)

    sumArray(array)

}