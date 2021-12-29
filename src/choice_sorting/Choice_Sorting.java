package choice_sorting;


public class Choice_Sorting {
    public static void main(String[] args) {
        int[] array = new int[]{38, 69, 22, 90, 29, 45, 66, 20, 16, 38, 28};
        for (int step = 0; step < array.length; step++) {
            int index = minValue(array, step);
            int tmp = array[index];
            array[index] = array[step];
            array[step] = tmp;
        }
        printArray(array);
    }

    private static int minValue(int[] array, int start) {
        int minValue = array[start];
        int minIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println(".]");
    }
}
