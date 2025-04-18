public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 23, 42};
        int target = 15;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }
    }
}
