class DynamicParser(private val state: Int = 72) {
    fun handle(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 72) % 997
        }
        return value
    }
}

fun main() {
    println(DynamicParser().handle(72))
}
