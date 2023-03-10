import kotlin.math.*

fun main() {
    print("При значении угла \u03B1\u00B0, что бы узнать чему равна гипотенуза\n" +
            " - введите значение противоположного катета и величину угла в градусах:\n")
    val (inputArg, alpha) = List(2) { readln().replace(',', '.').toDouble() }
    val alphaRad = alpha * PI / 180
    val firstArg = inputArg/ tan(alphaRad)
    val powSecondArg = inputArg.pow(2.0)
    val powFirstArg = firstArg.pow(2.0)
    val result = sqrt(powFirstArg + powSecondArg)
    val result2digits = String.format("%.2f", result)
    println("$result2digits мм")

}