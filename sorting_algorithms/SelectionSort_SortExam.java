package sorting_algorithms;

public class SelectionSort_SortExam {
    

    // Selection Sort method
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        // Move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first unsorted element
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] examScores = {85, 42, 97, 63, 78, 55};

        selectionSort(examScores);

        System.out.println("Sorted Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}


