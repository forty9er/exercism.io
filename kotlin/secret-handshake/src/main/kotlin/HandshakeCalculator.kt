object HandshakeCalculator {
    fun calculateHandshake(int: Int): List<Signal> {
        val binary = Integer.toBinaryString(int)
        return binary.reversed().mapIndexedNotNull { i, value ->
            when {
                i == 0 && value.isOne() -> Signal.WINK
                i == 1 && value.isOne() -> Signal.DOUBLE_BLINK
                i == 2 && value.isOne() -> Signal.CLOSE_YOUR_EYES
                i == 3 && value.isOne() -> Signal.JUMP
                else -> null
            }
        }.toList()
    }
}

fun Char.isOne() = this == '1'