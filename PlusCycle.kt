import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var N = sc.nextInt()

    var count = 0
    var origin = N

    do {
        val sum = (N % 10) + (N / 10) % 10
        N = (N % 10) * 10 + sum % 10
        count++
    } while (origin != N)

    println(count)
}