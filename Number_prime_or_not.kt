fun main() {
    print("enter Number=")
    var Num1 = readLine()!!.toInt()

    if ((Num1 == 2 ) || (Num1 == 3 ) || (Num1 == 5 ) || (Num1 == 7 ))
    {
        print("Its  Prime Number")
    }
    else if ((Num1%2!=0)&&(Num1%3!=0)&&(Num1%5!=0)&&(Num1%7!=0))
    {
        print("Its Prime Number")
    }
    else
    {
        print("Its Not a Prime Number")
    }
}