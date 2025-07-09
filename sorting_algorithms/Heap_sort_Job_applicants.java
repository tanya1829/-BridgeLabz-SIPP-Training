package sorting_algorithms;

public class Heap_sort_Job_applicants {


    // Heap Sort method
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // To heapify a subtree rooted at index i
    private static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;           // Initialize largest as root
        int left = 2 * i + 1;      // Left child
        int right = 2 * i + 2;     // Right child

        // If left child is larger than root
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, heapSize, largest);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] expectedSalaries = {55000, 72000, 48000, 90000, 60000};

        heapSort(expectedSalaries);

        System.out.println("Sorted Salary Demands (Ascending):");
        for (int salary : expectedSalaries) {
            System.out.print(salary + " ");
        }
    }
}
