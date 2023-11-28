class Input {

    fun inputNum (): String {
        var number = ""

        while (number.isEmpty()) {
            number = readln()
            var letterCheck = false

            number.forEach { it -> if (it.isLetter()) letterCheck = true}// 입력된 값에 문자가 포함되어있는지 체크

            if (letterCheck) {
                println("숫자만 입력해주세요.")
                number = ""
            }
            else if (number.isEmpty()) {
                println("값을 입력해주세요.")
            }
        }
        return number
    }

    fun inputOper (): String {
        var operator = ""

        while (operator.isEmpty()) {
            operator = readln()
            var operCheck = true

            operator.forEach { it -> if (it == '+' || it == '-' || it == '*'|| it == '/' || it == '%') operCheck = true else operCheck = false }
            if (!operCheck) {
                println("[+], [-], [/], [*], [%] 중에 하나를 입력해야합니다 ")
                operator = ""
            }
            else if (operator.isEmpty()) {
                println("연산자를 입력해주세요.")
            }
        }
        return operator
    }

}