package lecture.caculator;

public class Calculator {

    // 기본생성자

    // double 로 리턴
    // double 로 매개변수 두개를 받아서 더해주는 메소드

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {

        // 숫자는 0으로 나눌 수 없음
        // -> secondNumber가 0이 입력되면
        // DIVIDE_BY_ZERO 하는 상수로 CalcualtorException 발생시키자
        // DIVIDE_BY_ZERO 정보
        // - code : CAL-003
        // - message : "0으로 나눌 수 없습니다."

//        switch ((int) secondNumber) {
//            case 0 :
//                throw new CalculatorException(CalculatorErrorCode.INVALID_BY_ZERO);
//            default:
//                return firstNumber / secondNumber;
//        }

        if (secondNumber == 0) {
            throw new CalculatorException(CalculatorErrorCode.INVALID_BY_ZERO);
        }
        return firstNumber / secondNumber;
    }

}
