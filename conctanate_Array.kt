fun main() {
    var Array1 = intArrayOf(2, 5, 6, 7, 8)
    var Array2 = intArrayOf(3, 4, 5, 1)

    var Array3 = Array1.plus(Array2)

    for (elements in Array3) {
        print("$elements\t")

    }


}