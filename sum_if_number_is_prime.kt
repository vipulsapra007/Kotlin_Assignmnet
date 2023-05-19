fun main() {
    print("Enter Number1=")
    var Num1 = readLine()!!.toInt()
    print("Enter NUmber2=")
    var Num2 = readLine()!!.toInt()
    var flag1 = 0
    var flag2 = 0
    for (i in 2..Num1 / 2) {
        if (Num1 % i == 0) {
            flag1 = 1
        }
    }
    for (i in 2..Num2 / 2) {
        if (Num2 % i == 0) {
            flag2 = 1
        }
    }

    if (flag1 != 0) {
        print("$Num1 is Not Prime")
    } else if (flag2 != 0) {
        print("$Num2 is Not Prime")
    } else {
        print("Both Numbers Prime and sum =${Num1 + Num2}")
    }


}
