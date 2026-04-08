import java.util.Scanner;

public class Solution {
    
    // TODO: Write the generic method findMax(T[] array) here
    // Hint: The type parameter T must extend Comparable<T>    
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer array
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        
        // TODO: Call findMax on intArray and print the result
        // Format: "Max Integer: [val]"
        
        
        // Read string array
        int m = scanner.nextInt();
        String[] strArray = new String[m];
        for (int i = 0; i < m; i++) {
            strArray[i] = scanner.next();
        }
        
        // TODO: Call findMax on strArray and print the result
        // Format: "Max String: [val]"
        System.out.println("Max Integer: " + findMax(intArray));
        System.out.println("Max String: " + findMax(strArray));
        
        scanner.close();
    }
}
