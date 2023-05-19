fun main() {
    print("Enter String=")
    var str = readLine()!!

    print(ispalindrome(str))
}

fun ispalindrome(string: String): Boolean {

    var strReverse = string.reversed()

    if (string == strReverse) {
        return true
    } else
        return false
}