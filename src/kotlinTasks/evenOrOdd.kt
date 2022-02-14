import java.util.Scanner
fun main(){

    var reader = Scanner(System.`in`)

    println("enter number")
    var number = reader.nextInt()

    if ( number % 2 == 0){
        println("number is even")
    }
    else {
        println("number is odd")
    }

}