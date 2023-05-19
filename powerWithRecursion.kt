fun power(n: Int, p: Int): Int {
    return if (p == 0) {
        1
    } else {
        n * power(n, p - 1)
    }
}

fun main() {
    print("enter number=")
    var Num = readLine()!!.toInt()
    print("Enter Power=")
    var P = readLine()!!.toInt()

    print("$Num power $P=${power(Num, P)}")

}
