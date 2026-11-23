class StreamMonitor(private val state: Int = 29) {
    fun run(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 29) % 997
        }
        return count
    }
}

fun main() {
    println(StreamMonitor().run(29))
}
