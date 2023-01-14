interface Numbers {
    fun sum(): Int
    fun subtract(): Int
    fun divide(): Double

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

        override fun divide(): Double {
            return number1.toDouble()/ number2
        }
    }

    class Doubles(
        private val number1 : Double,
        private val number2 : Double
    ) : Numbers {
        override fun sum(): Int {
            TODO()
        }

        override fun subtract(): Int {
            TODO("Not yet implemented")
        }

        override fun divide(): Double {
            return number1 / number2
        }

    }
}
