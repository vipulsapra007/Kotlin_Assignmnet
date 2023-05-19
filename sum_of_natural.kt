fun main() {
    print("enter number upto which u need sum=")
    var n = readLine()!!.toInt()

    var sum = 0
    var i = 1
    for (i in 1..n) {
        sum = sum + i


    }
    print("sum of $n number =$sum")
}