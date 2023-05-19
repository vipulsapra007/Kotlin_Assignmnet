fun gcd(a: Int, b: Int): Int {

    if (b == 0) {
        return a
    }
    return gcd(b, a % b)
}

fun main() {
 print("Enter Number 1=")
    var num1= readLine()!!.toInt()
    print("Enter Number 2=")
    var num2= readLine()!!.toInt()
    val result = gcd(num1, num2)
    println("GCD of $num1 and $num2 is: $result")
}