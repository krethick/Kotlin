fun main()
{
    val number = 2
    for(i in 1..10)
    {
        //println(number.toString() + " x " + i + " = " + (number * i))
        //String Templating
        println("$number x $i = ${number * i}")
    }
}