fun main() {
    print("Enter Number=")
    var Num1 = readLine()!!.toInt()
    var Number = Num1

    var reversed = 0
    while (Num1 != 0) {
        var digit = Num1 % 10
        reversed = reversed * 10 + digit
        Num1 = Num1 / 10
    }
    print("Reversed Number =${reversed}")
    if (Number == reversed) {
        println("\nIts Palindrome Number")
    } else {
        println("\nIts Not Palindrome Number")
    }

}



