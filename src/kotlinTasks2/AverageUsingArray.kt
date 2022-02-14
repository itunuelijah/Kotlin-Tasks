package kotlinTasks2

import java.util.*


    fun main(args: Array<String>) {

        val scanner = Scanner(System.`in`)

        //Input Array Size
        print("Enter number of elements in the array: ")
        val sizeOfArray = scanner.nextInt()

        //Create Double array of Given size
        val doubleArray = DoubleArray(sizeOfArray)

        //Input array elements
        println("Enter Arrays Elements:")
        for (i in doubleArray.indices) {
            print("doubleArray[$i] : ")
            doubleArray[i] = scanner.nextDouble()
        }

//        //declare variable for sum of elements
//        var sum: Double=0.toDouble()
//
//        for (i in doubleArray.indices) {
//            //add array element in sum
//            sum+=doubleArray[i]
//        }

//        //Average of elements
//        var average = sum/doubleArray.size

        var sum = doubleArray.sum()
        var avg = doubleArray.average()

        println("Array : ${doubleArray.contentToString()} ")
        println("Sum of Elements : $sum")
        println("Average of Elements : $avg")
    }

