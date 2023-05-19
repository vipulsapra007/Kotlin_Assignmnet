fun main() {
    print("Enter Number=")
    var realNum = readLine()!!.toInt()



    var Power = realNum.toString().length

    var Num2 = realNum
    var sum = 0


    while (Num2 != 0) {
        var Digit = Num2 % 10
        var powerDigit = Math.pow(Digit.toDouble(), Power.toDouble())
        sum += powerDigit.toInt()
        Num2 /= 10

    }
    if (sum == realNum) {
        print("its armstrong number")
    } else {
        print("Its not armstrong number")
    }
}