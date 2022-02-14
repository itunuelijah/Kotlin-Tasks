package kotlinTasks2

import java.util.*

fun isAnagrams(string1: String, string2: String): Boolean {
    //Both String Length must be Equal
    if (string1.length != string2.length) {
        return false
    }

    //Convert Strings to character Array
    val stringArray1 = string1.toCharArray()
    val stringArray2 = string2.toCharArray()

    //Sort the Arrays
    Arrays.sort(stringArray1)
    Arrays.sort(stringArray2)

    //Convert Arrays to String
    val sortedString1 = String(stringArray1)
    val sortedString2 = String(stringArray2)

    //Check Both String Equals or not After Sorting
    //and Return value True or False
    return sortedString1 == sortedString2
}

//Main Function, entry Point of Program
fun main(args: Array<String>) {
    //Input Stream
    val scanner = Scanner(System.`in`)

    //Enter String Value
    println("Enter String1 : ")
    val string1: String = scanner.nextLine()

    println("Enter String2 : ")
    val string2: String = scanner.next()

    //Call Function to  check anagram String
    if (isAnagrams(string1, string2)) {
        println("Anagram Strings !!")
    } else {
        println("Strings are not Anagram !!")
    }
}