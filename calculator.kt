fun main() {
    print(
        """=*=*=*=enter Your choice=*=*=*=
    press 1 for sum
    press 2 for subtraction
    press 3 for multiplication
    press 4 for division
    
    Your choice=
    """.trimMargin())
    var n = readLine()!!.toInt()

    print("\nenter number 1=")
    var a = readLine()!!.toInt()

    print("enter number 2=")
    var b = readLine()!!.toInt()
    when (n) {
        1 -> println("addition : ${a + b}")
        2 -> println("subtraction : ${a - b}")
        3 -> println("multiplication : ${a * b}")
        4 -> println("Divison: ${a / b.toFloat()}")

    }
}