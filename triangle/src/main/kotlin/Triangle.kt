class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    init {
        if (a == 0 || b == 0 || c == 0) {
            throw IllegalArgumentException()
        }

        if (a is Int && b is Int && c is Int && (a + b < c || b + c < a || c + a < b)) {
            throw IllegalArgumentException()
        }
    }

    val isEquilateral: Boolean = a == b && b == c && c == a
    val isIsosceles: Boolean = a == b || b == c || c == a
    val isScalene: Boolean = !isEquilateral && !isIsosceles
}
