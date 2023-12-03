import java.util.Scanner
fun main() {
    val sc:Scanner = Scanner(System.`in`)
    val A = sc.nextInt()
    val B = sc.nextInt()

    if (A > B) print(">")
    else if(A == B) print ("==")
    else print("<")
}