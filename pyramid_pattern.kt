fun main() {
    var rows = 5
    var k = 0
    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print("  ")
        }
        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }
        k = 0
        println()
    }
}