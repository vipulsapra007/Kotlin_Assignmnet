fun main() {
    print("Enter String=")
    var str = readLine()!!

    var charArray = str.toCharArray()
    charArray.sort()

    var sorted = String(charArray)

    print("Sorting of String=$sorted")


}
