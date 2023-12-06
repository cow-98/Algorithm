import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var hour = scanner.nextInt()
    var minute = scanner.nextInt()

    minute -= 45

    if (minute < 0) {
        minute += 60
        hour--

        if (hour < 0) {
            hour = 23
        }
    }

    println("$hour $minute")
}
