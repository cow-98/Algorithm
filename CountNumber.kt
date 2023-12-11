import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val A = sc.nextInt()
    val B = sc.nextInt()
    val C = sc.nextInt()

    val res = A*B*C

    val arr =IntArray(10)

    res.toString().forEach {
        arr[it - '0']++
    }
    arr.forEach { println(it) }
}