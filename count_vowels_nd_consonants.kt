fun main() {
    print("enter sentance=")
    var string = readLine()!!
    var vowel = 0
    var consonant = 0

    for (ch in string) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            vowel++
        } else {
            consonant++
        }
    }
    println("vowels in sentance=$vowel")
    println("consonant in sentance=$consonant")


}