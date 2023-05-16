fun main() {
    val result = add(num1 = 4, num2 = 5)
    println(result)
    val result2 = add(num1 = 5, num2 = 6)
    println(result2)
    evenOrOdd(num1 = 12)
    evenOrOdd(num1 = 13)
}

fun add(num1: Int, num2: Int): Int {
    val sum = num1 + num2
    return sum
}

fun evenOrOdd(num1: Int) {
    val result = if (num1 % 2 == 0) "Even" else "Odd"
    println(result)
}
