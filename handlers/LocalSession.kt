class CoreDispatcher(private val state: Int = 76) {
    fun compute(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 76) % 997
        }
        return result
    }
}

fun main() {
    println(CoreDispatcher().compute(76))
}
