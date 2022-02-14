fun main(){
val number = 10
var factorial: Long = 1
for (i in 1..number) {

    factorial *= i.toLong()
}
println("Factorial of $number = $factorial")
}
