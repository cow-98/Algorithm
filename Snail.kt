import java.util.Scanner
fun main() {

    val sc = Scanner(System.`in`)

    val A = sc.nextInt()
    val B = sc.nextInt()
    val V = sc.nextInt()

    var day = (V - B - 1) / (A - B) + 1

    println(day)
}