class LiteParser(private val state: Int = 84) {
    fun sync(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 84) % 997
        }
        return result
    }
}

fun main() {
    println(LiteParser().sync(84))
}
