fun main() {
    val input = readLine()

    if (input != null) {
        val numbers = input.split(" ")
        if (numbers.size == 2) {
            try {
                val A = numbers[0].toInt()
                val B = numbers[1].toInt()
                val result = A * B
                println("$result")
            } catch (e: NumberFormatException) {

            }
        }
    }
}