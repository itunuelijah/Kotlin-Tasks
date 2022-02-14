package kotlinTasks2

import java.util.Arrays

fun main(args: Array<String>) {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)

    val arrayA = array1.size
    val arrayB = array2.size
    val result = IntArray(arrayA + arrayB)

    System.arraycopy(array1, 0, result, 0, arrayA)
    System.arraycopy(array2, 0, result, arrayA, arrayB)

    println(Arrays.toString(result))
}