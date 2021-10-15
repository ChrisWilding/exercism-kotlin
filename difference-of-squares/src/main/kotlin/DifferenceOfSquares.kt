class Squares(private val input: Int) {
    fun sumOfSquares(): Int {
        return input * (input + 1) * (2 * input + 1) / 6
    }

    fun squareOfSum(): Int {
        val sum = input * (input + 1) / 2
        return sum * sum
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
