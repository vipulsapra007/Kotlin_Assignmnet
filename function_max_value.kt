fun max(a: Int, b: Int, c: Int) {
    if (a > b && a > c) {

        print("$a is Maxium Number")

    } else if (b > a && b > c) {
        print("$b is Maximum Number")
    } else {
        print("$c is Maximum Number")
    }
}

fun main() {
    print("Enter Number 1=")
    var Num1 = readLine()!!.toInt()
    print("Enter Numbwr 2=")
    var Num2 = readLine()!!.toInt()
    print("Enter Number 3=")
    var Num3 = readLine()!!.toInt()
    max(Num1, Num2, Num3)


}