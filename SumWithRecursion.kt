fun sum(n: Int): Int {
    return if (n == 0) {
        0
    } else {
        n + sum(n - 1)
    }
}
fun main()
{
    print("Enter Number=")
    var Num= readLine()!!.toInt()

    print("sum of $Num number =${sum(Num)}")

}