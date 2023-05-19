fun main()
{
    print("Enter Any Number=")
    var Num1= readLine()!!.toInt()


    if(Num1 !in 1..100)

    {
        print("Its Out of Range of 100")
    }
    else {
        print("Number is in Range of 100")
    }
}