class HybridHandler(private val state: Int = 70) {
    fun decode(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 70) % 997
        }
        return result
    }
}

fun main() {
    println(HybridHandler().decode(70))
}
