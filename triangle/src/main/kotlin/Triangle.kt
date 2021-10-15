class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    init {
        require(a != 0 && b != 0 && c != 0)

        if (a is Int && b is Int && c is Int) {
            require(a + b >= c && b + c >= a && c + a >= b)
        }
    }

    val isEquilateral: Boolean = a == b && b == c && c == a
    val isIsosceles: Boolean = a == b || b == c || c == a
    val isScalene: Boolean = !isEquilateral && !isIsosceles
}
