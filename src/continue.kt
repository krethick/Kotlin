/*
fun main(args: Array<String>)
{
    var i = 0;
    while (i++ < 6)
    {
        if(i==3)
        {
            continue
        }
        println(i)
    }
} */

// Labeled continue

fun main(args: Array<String>)
{
    outerLoop@ for (i in 1..3)
        innerLoop@ for (j in 1..3)
        {
            if(i == 2)
            {
                continue@outerLoop
            }
            println("i = $i and j = $j")
        }
}

//Hello how are you

//Added another comment

//Added another comment

//Final comment