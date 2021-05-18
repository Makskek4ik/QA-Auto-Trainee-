package Tasks;

public class Task3 {

    private static final int NUMBER = 3;

    public static void main(String[] args) {
        int[] arr = new int[]{-6, -3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        getArrMultipleNumber(NUMBER, arr);
    }

    public static void getArrMultipleNumber(int number, int[] arr) {
        for (int currNumber : arr) {
            if (currNumber % number == 0) {
                System.out.println(currNumber);
            }
        }
    }
}
