interface Numbers {
    fun sum(): Int
    fun subtract(): Int

    class Base(
        private val number1: Int,
        private val number2: Int
    ) : Numbers {
        override fun sum(): Int {
            return number1 + number2

        }
        override fun subtract(): Int {
            return number1 - number2
        }
    }
}