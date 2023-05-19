fun armstrong(a: Int) {
    var x = a
    var power = a.toString().length
    var sum = 0
    while (x != 0) {
        var digit = x % 10
        var powerOfdigit = Math.pow(digit.toDouble(), power.toDouble())
        sum = (sum + powerOfdigit).toInt()
        x = x / 10
    }
    if (a == sum) {
        print("\t$a")

    }
}

fun main() {
    print("Enter Starting Range=")
    var Num1 = readLine()!!.toInt()
    print("Enter Ending Range=")
    var Num2 = readLine()!!.toInt()


    for (i in Num1..Num2) {
        armstrong(i)
    }


}


