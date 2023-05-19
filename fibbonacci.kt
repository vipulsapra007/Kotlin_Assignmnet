fun main() {
    print("enter number=")
    var n = readLine()!!.toInt()
    var a = 0
    var b = 1
    print("fibbonacci series is here=")
    for (i in 1..n) {
        print(a)
        print("\t")

        var sum = a + b
        a = b
        b = sum
    }
}
