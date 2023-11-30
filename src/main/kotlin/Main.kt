fun main() {
    var inputNumber1: Double
    var operator = ""
    var inputNumber2: Double

    // 1번째 숫자 값 입력
    inputNumber1 = Input().inputNum()

    while (true) {
        operator = Input().inputOperator()          // while 이후로 연산자를 입력해 계산을 계속 할 수 있도록함

        if (operator == "=") break              // = 을 입력하면 종료되도록 만듬

        inputNumber2 = Input().inputNum()

        val calculator = Calculate(inputNumber1, inputNumber2, operator)    // Calculate 클래스에 숫자를 넘겨 계산을 위한 인스턴스 생성

        val resValue = calculator.calc()        // 연산자를 확인해 연산자에 따라 계산을 진행하는 함수를 실행해 결과값을 저장

        val result = if (resValue % 1 == 0.0) resValue.toLong() else resValue       //만약 소수점 뒤에 0뿐이라면 정수만 출력, 소수점 뒤에 숫자가 있다면 소수점까지 출력
        println(result)

        inputNumber1 = resValue     // 숫자 1에 결과값을 넣어 계속해서 계산을 이어가도록함
    }
}

