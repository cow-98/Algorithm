import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val N = sc.nextInt()

    var bagCount = -1

    for (i in 0..N/3) {
        for (j in 0..N/5){
            if (i * 3 + j * 5 == N) {
                bagCount = i + j
                break
            }
        }
        if (bagCount != -1) break
    }
    println(bagCount)
}