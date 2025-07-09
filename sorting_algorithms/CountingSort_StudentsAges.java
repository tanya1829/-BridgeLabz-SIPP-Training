package sorting_algorithms;

public class CountingSort_StudentsAges {
   

    // Counting Sort method for ages between 10 and 18
    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];       // Frequency array
        int[] output = new int[ages.length]; // Sorted output array

        // Step 1: Count frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in correct positions (traverse in reverse for stability)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy sorted ages back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] studentAges = {15, 12, 18, 14, 10, 13, 17, 12, 15};

        countingSort(studentAges);

        System.out.println("Sorted Student Ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}

