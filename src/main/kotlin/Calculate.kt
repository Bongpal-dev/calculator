class Calculate (val oper: Operation) {
    fun calc(n1: Double, n2: Double): Double{
           return oper.operate(n1, n2)
    }

}