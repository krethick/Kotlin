/* Range statement

fun main()
{
    val number = 5
    val result = number in 1 until 5 //1,2,3,4,5
    print(result)
}

 When statement

fun main ()
{
    val animal = "Dog"
    when(animal)
    {
        "Horse" -> println("Animal is a horse")
        "Cat" -> println("Animal is a cat")
        "Dog" -> println("Animal is a dog")
        else -> println("Animal not Found")
    }
}
 */

fun main ()
{
    val number = 15
    val result = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Not in range"
    }
    println(result)
}
