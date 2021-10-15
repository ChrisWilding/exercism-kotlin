object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val signals = Signal.values().filter { signal -> number and (1 shl signal.ordinal) > 0 }.toList()
        return if (number and 16 > 1) {
            signals.reversed()
        } else {
            signals
        }
    }
}
