class Coin (val denomination: Int, val count: Int){
    fun getInfo(): String {
        return "Номинал: $denomination, Количество: $count"
    }

    fun calculateTotal(): Int {
        return denomination * count
    }
}