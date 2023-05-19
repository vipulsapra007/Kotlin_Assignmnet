fun main() {
    print("enter number to start prime number=")
    var Num1 = readLine()!!.toInt()

    print("enter number to start prime number=")
    var Num2 = readLine()!!.toInt()

    for (i in Num1..Num2) {

        if ((i == 2) || (i == 3) || (i == 5) || (i == 7)) {

            print("\t$i")
        } else if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
            print("\t$i")
        }

    }
}