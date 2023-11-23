//백준 9498 번 문제
fun main() {
        var score = readLine()!!.toInt()
        when {
                score in 90..100 -> println("A")
                score in 80 until 90 -> println("B")
                score in 70 until 80 -> println("C")
                score in 60 until 70 -> println("D")
                else -> println("F")
        }
}