class StreamSession(private val state: Int = 33) {
    fun fetch(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 33) % 997
        }
        return value
    }
}

fun main() {
    println(StreamSession().fetch(33))
}
