package exercise.normal;

public class RandomMaker {

    public int generate() {
        return (int) ((Math.random() * 100) + 1);
    }

    public int generateInRange(int min, int max) {
        int a = max - min;
        return (int) ((Math.random() * a) + min);
    }
}
