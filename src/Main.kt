//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите номинал монеты: ")
    val denomination = readLine()?.toIntOrNull() ?: 0
    print("Введите количество монет: ")
    val count = readLine()?.toIntOrNull() ?: 0
    val coin = Coin(denomination, count)
    println("Информация о монетах:")
    println(coin.getInfo())
    println("Общая сумма монет: ${coin.calculateTotal()}")
}
