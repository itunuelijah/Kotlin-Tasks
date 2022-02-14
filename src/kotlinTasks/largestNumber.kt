import java.util.*

fun main() {

    var reader = Scanner(System.`in`)

    println("enter first number")
    var number1 = reader.nextInt()

    println("enter second number")
    var number2 = reader.nextInt()

    println("enter third number")
    var number3 = reader.nextInt()

    println(Math.max(number1, Math.max(number2, number3)))

}