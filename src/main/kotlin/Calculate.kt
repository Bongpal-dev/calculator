class Calculate (val n1: Double, val n2: Double, val op: String) {

    fun calc (): Double {
        when (op) {
            "+" -> return add(n1, n2, AddOperation())
            "-" -> return sub(n1, n2, SubstractOperation())
            "*" -> return multi(n1, n2, MultiplyOperation())
            "/" -> return div(n1, n2, DivideOperation())
            "%" -> return n1 % n2
        }
        return 0.0
    }

    fun add(num1: Double, num2: Double, addOper: AddOperation ): Double {
        return addOper.operate(num1, num2)
    }

    fun sub(num1: Double, num2: Double, subOper: SubstractOperation ): Double {
        return subOper.operate(num1, num2)
    }

    fun multi(num1: Double, num2: Double, multiOper: MultiplyOperation ): Double {
        return multiOper.operate(num1, num2)
    }

    fun div(num1: Double, num2: Double, divOper: DivideOperation ): Double {
        return divOper.operate(num1, num2)
    }


}