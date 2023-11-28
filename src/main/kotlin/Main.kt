import javax.lang.model.type.UnionType

fun main() {
    var inputNumber1: Double
    var operator: String
    var inputNumber2: Double

    inputNumber1 = Input().inputNum().toDouble()
    operator = Input().inputOper()
    inputNumber2 = Input().inputNum().toDouble()

    var calculator = Calculate(inputNumber1, inputNumber2, operator)


    var resValue = calculator.calc()

    var result = if(resValue % 1 == 0.0) resValue.toInt() else resValue

    inputNumber1 = resValue

    println(result)

}

