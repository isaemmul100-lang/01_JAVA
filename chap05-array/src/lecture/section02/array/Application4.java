package lecture.section02.array;

public class Application4 {

    public static void main(String[] args) {

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        System.out.println("shapes = " + shapes[0]);
        System.out.println("cardNumbers = " + cardNumbers[0]);


        // MATH 난수 발생시키는 random() 뽑은 카드를 출력
        // 0 ~ 1
        // 최대로 나올 수 있는 수
        // 0.99xxxx * 5 => 4.9...x
        int num = (int) Math.random() * shapes.length; // 0 ~ 3
        int num2 = (int) Math.random() * cardNumbers.length; //0 ~ 13

        System.out.println("당신이 뽑은 카드는 " + shapes[num] + " " + cardNumbers[num2] + " 카드 입니다.");

    }
}
