import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)

    val burgerPrice = List(3){sc.nextInt()}
    val drinkPrice = List(2){sc.nextInt()}

    var cheapestSet = burgerPrice.minOrNull()!! + drinkPrice.minOrNull()!!
    cheapestSet -=50

    print("$cheapestSet")
}