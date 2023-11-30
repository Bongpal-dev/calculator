import javax.lang.model.type.UnionType

fun main() {
    var inputNumber1: Double
    var operator = ""
    var inputNumber2: Double

    inputNumber1 = Input().inputNum()

    while (true) {
        operator = Input().inputOper()

        if (operator == "=") break

        inputNumber2 = Input().inputNum()

        var calculator = Calculate(inputNumber1, inputNumber2, operator)

        var resValue = calculator.calc()
        var result = if (resValue % 1 == 0.0) resValue.toLong() else resValue

        inputNumber1 = resValue

        println(result)
    }
}

