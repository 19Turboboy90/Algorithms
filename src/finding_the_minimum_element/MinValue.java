package finding_the_minimum_element;

public class MinValue {
    public static void main(String[] args) {
        int[] array = new int[]{34, 3, 56, 27, 85, 25, 83, 66, 28, 57, 48};
        minValue(array);
    }

    private static void minValue(int[] arr) {
        int minIndex = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        System.out.println("The minimum number in the array: " + minValue + "\nIndex of the minimum number: " + minIndex);
    }
}
