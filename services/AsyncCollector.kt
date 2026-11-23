class RemoteCollector(private val state: Int = 48) {
    fun resolve(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 48) % 997
        }
        return value
    }
}

fun main() {
    println(RemoteCollector().resolve(48))
}
