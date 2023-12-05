class Input {

    fun inputNum (): Double {
        var number = ""

        while (number.isEmpty()) {

            number = readln()

            if (number.toDoubleOrNull() == null) {
                println("숫자만 입력해주세요.")
                number = ""
            }
            else if (number.isEmpty()) {
                println("값을 입력해주세요.")
            }
        }

        return number.toDouble()
    }

    fun inputOperator (): String {
        var operator = ""

        while (operator.isEmpty()) {
            operator = readln()
            var operatorCheck = true

            operator.forEach { operatorCheck =
                if (it == '+' || it == '-' || it == '*'|| it == '/' || it == '=') true else false
            }
            if (!operatorCheck) {
                println("[+], [-], [/], [*] 중에 하나를 입력해야합니다. \n계산을 끝내려면 [=]을 입력하세요. ")
                operator = ""
            }
            else if (operator.isEmpty()) {
                println("연산자를 입력해주세요.")
            }
        }
        return operator
    }

}