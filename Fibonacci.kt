import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val res = fibonacci(n)
    println(res)
}

fun fibonacci(n: Int): Int {
    if (n <= 1) {
        return n
    }
    var a = 0
    var b = 1

    for (i in 2..n) {
        val temp = a + b
        a = b
        b = temp
    }
    return b
}