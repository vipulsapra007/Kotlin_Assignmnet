fun main()
{
    print("enter any variable=")
    var a= readLine()!![0]

//    if(a>'a'||a<'z'||a>'A'||a<'Z')
    if(a in 'a'..'z'||a in 'A'..'Z')
    {
        print("its alphabet")
    }
    else
    {
        print("Its not alphabet")
    }

}