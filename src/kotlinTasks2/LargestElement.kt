package kotlinTasks2

import java.util.*


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    //Input Array Size
    print("Enter number of elements in the array: ")
    val arraySize = scanner.nextInt()

    //Create Integer array of Given size
    val intArray = IntArray(arraySize)

    //Input array elements
    println("Enter Arrays Elements:")
    for (i in intArray.indices) {
        print("intArray[$i] : ")
        intArray[i] = scanner.nextInt()
    }

    //Assign First Elements of array as Largest
    var largest = intArray[0]

    for (i in 1 until intArray.size) {
        //compare largest with Array Elements value
        if (largest < intArray[i]) {
            //assign array elements into largest
            largest = intArray[i]
        }
    }

    //var largest = intArray.max()

    //Print Array Elements
    println("Array : ${intArray.contentToString()} ")

    //Print Largest Array Value
    println("Largest Elements of Array is : $largest")

}