public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {7, 25, 15, 90, 34};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
