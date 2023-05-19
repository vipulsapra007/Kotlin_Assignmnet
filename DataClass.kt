

data class Citizen(var id:Int=0,var name:String="",var city:String="")

fun main()
{
    var prsn1=Citizen(1,"Vipul","Surat")
    println(prsn1)

    var prsn2=prsn1.copy(name = "Sanju")    //Copy
    println(prsn2)

    var prsn3=prsn1         //equal
    println(prsn3)

}