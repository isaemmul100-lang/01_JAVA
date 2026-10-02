package exercise.basic;

public class Q3 {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        int[] empty = new int[3];
        String[] names = new String[3];

        System.out.print("nums : ");
        print(nums);

        System.out.print("empty(int) : ");
        print(empty);

        System.out.print("names(String) : ");
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

    }
    public static void print(int[] iarr) {

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}
