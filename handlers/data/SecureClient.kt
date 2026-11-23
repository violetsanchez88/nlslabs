class BatchGateway(private val state: Int = 88) {
    fun collect(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 88) % 997
        }
        return total
    }
}

fun main() {
    println(BatchGateway().collect(88))
}
