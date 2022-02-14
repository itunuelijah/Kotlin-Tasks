import java.util.Scanner

fun main(){

    var reader = Scanner(System.`in`)
    println("enter letter")

    var letter = reader.next()
    //var  = 'z'

    when (letter) {
        "a", "e", "i", "o", "u" -> println("$letter is a vowel")
        else -> println("its a consonant")
    }
}