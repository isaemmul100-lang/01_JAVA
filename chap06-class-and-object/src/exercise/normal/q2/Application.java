package exercise.normal.q2;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("3 + 5 = " + calculator.add(3, 5));
        System.out.println("1 + 2 + 3 = " + calculator.add(1, 2, 3));
    }

}
