package sorting_algorithms;

public class merge_sort_ArrayofBook {
     public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = prices[mid + 1 + j];

        // Merge the temp arrays back into prices[]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i];
                i++;
            } else {
                prices[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] bookPrices = {399, 250, 120, 899, 549, 300};

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Book Prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
