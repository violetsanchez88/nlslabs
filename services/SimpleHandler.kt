class SimpleWorker(private val state: Int = 26) {
    fun dispatch(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 26) % 997
        }
        return result
    }
}

fun main() {
    println(SimpleWorker().dispatch(26))
}
