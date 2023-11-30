class Calculate (val n1: Double, val n2: Double, val op: String) {

    fun calc (): Double {
        when (op) {
            "+" -> return AddOperation().operate(n1,n2)
            "-" -> return SubstractOperation().operate(n1, n2)
            "*" -> return MultiplyOperation().operate(n1, n2)
            "/" -> return DivideOperation().operate(n1, n2)
            "%" -> return n1 % n2
        }
        return 0.0
    }

}