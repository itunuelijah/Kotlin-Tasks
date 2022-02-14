import java.util.*

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)

    println("Enter first integer number:")
    var a = read.nextInt()

    println("Enter second integer number:")
    var b = read.nextInt()

    println("Before Swap: a = $a, b: $b")

    val c = b
    b = a
    a = c

    println("After Swap: a = $a, b: $b")
}