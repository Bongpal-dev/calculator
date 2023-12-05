fun main() {
    var inputNumber1: Double
    var operateSymbol = ""
    var inputNumber2: Double
    lateinit var calculator: Calculate // 연산을 할 인스턴스 생성

    // 1번째 숫자 값 입력
    inputNumber1 = Input().inputNum()

    while (true) {
        operateSymbol = Input().inputOperator()          // while 이후로 연산자를 입력해 계산을 계속 할 수 있도록함

        if (operateSymbol == "=") break              // = 을 입력하면 종료되도록 만듬

        inputNumber2 = Input().inputNum()

        when (operateSymbol) {
            "+" -> calculator = Calculate(AddOperation())
            "-" -> calculator = Calculate(SubstractOperation())
            "*" -> calculator = Calculate(MultiplyOperation())
            "/" -> calculator = Calculate(DivideOperation())
        }    // 인스턴스에 연산별 원하는 클래스를 대입

        val resValue = calculator.calc(inputNumber1, inputNumber2)        // 숫자를 대입해서 연산

        val result = if (resValue % 1 == 0.0) resValue.toLong() else resValue       //만약 소수점 뒤에 0뿐이라면 정수만 출력, 소수점 뒤에 숫자가 있다면 소수점까지 출력
        println(result)

        inputNumber1 = resValue     // 숫자 1에 결과값을 넣어 계속해서 계산을 이어가도록함
    }
}

