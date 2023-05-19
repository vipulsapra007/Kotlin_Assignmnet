fun main() {


    print("enter string=")
    var string= readLine()!!

    var noSpaceStr = string.replace("\\s+".toRegex(), "")
    println(noSpaceStr)
}