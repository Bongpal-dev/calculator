class Calculate (val n1: Double, val n2: Double, val op: String) {

    fun calc (): Double {
        // 연산자에 따라 다른 클래스의 operate 함수를 호출
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