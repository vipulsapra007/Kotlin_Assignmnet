class Person() {
    var age = 0
    var name = ""
    var email = ""

    fun display() {
        println(
            """
            Name    :$name
            Age     :$age
            Email   :$email
        """.trimIndent()
        )
    }
}

fun main() {
    var s1 = Person()

    print("Enter Name=")
    s1.name = readLine()!!
    print("Enter Age=")
    s1.age= readLine()!!.toInt()
    print("Enter Email Id=")
    s1.email = readLine()!!
    s1.display()
}

