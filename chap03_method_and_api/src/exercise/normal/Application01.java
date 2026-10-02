package exercise.normal;

public class Application01 {

    public static void main(String[] args) {
        RandomMaker ran = new RandomMaker();

        int min = 50;
        int max = 60;
        System.out.println("1 ~ 100 난수: " + ran.generate());
        System.out.println(min + " ~ " + max + "난수 : " + ran.generateInRange(min, max));
    }
}
