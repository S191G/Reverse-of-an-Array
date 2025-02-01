import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Reverse the array using brute force
        reverseArray(arr);

        // Print reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // Method to reverse the array using brute force
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap the elements until the middle of the array is reached
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
}
