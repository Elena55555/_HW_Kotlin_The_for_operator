
import kotlin.math.sqrt
import kotlin.math.*
import kotlin.math.pow

fun main() {
    println("Task 1 ")
    println("Enter an  A: ")
    val A = readLine()!!.toInt()
    println("Enter a  B: ")
    val B = readLine()!!.toInt()
    var sum = 0.0
    val n = B - A
    var average = 0.0
    for (i in A..B) {
        sum += i
    }
        average = sum / n
        println(average)

    println("  ")
    println("Task 2 ")

    println("Enter a  S: ")
    val S = readLine()!!.toInt()
    val D = sqrt(4*S/PI)
    println("The diameter of the circle is: $D")
    val L = PI*D
    println("The length of the circle is: $L")

    println("  ")
    println("Task 3 ")

    println("Enter a x1: ")
    val x1   = readLine()!!.toInt()
    println("Enter an y1: ")
    val y1   = readLine()!!.toInt()
    println("Enter a x2>x1: ")
    val x2   = readLine()!!.toInt()
    println("Enter an y2>y2: ")
    val y2   = readLine()!!.toInt()

    val a = x2-x1
    val b = y2-y1
    println("Rectangle perimeter: ${(a + b) * 2},  Rectangle area: ${a * b}")

    println("  ")
    println("Task 4 (with a For loop))")

    /** We get a digital series with:
     * pow() -  There is no exponentiation operator in Kotlin, but there is a pow()
     * function that can be called on a Float or Double object.
     * toInt() - converting to int
     */

    val k  = 0
    for(k in 0..9) {
        println("${(2.0.pow(k)).toInt()} \t")
    }

     println("  ")
     println("Task 4 (with a while loop)")

     var i = 1
       while (i <= 512) {
        println("$i   ")
     i *= 2

     }


    println("  ")
    println("Task 5")
    for (i in 20 downTo 1 step 2) {
        println("$i ")
    }
}



























