package linearSearch04And05;
import java.util.Arrays;
public class ChallengeProblem {
    

public class LinearBinaryChallenge {
    public static int findFirstMissingPositive(int[] arr) {
        boolean[] present = new boolean[arr.length + 1];
        for (int num : arr) {
            if (num > 0 && num <= arr.length) {
                present[num] = true;
            }
        }
        for (int i = 1; i <= arr.length; i++) {
            if (!present[i]) return i;
        }
        return arr.length + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int missing = findFirstMissingPositive(arr);
        System.out.println("First missing positive: " + missing);

        Arrays.sort(arr);
        int target = 1;
        int index = binarySearch(arr, target);
        System.out.println("Index of " + target + ": " + index);
    }
}
}


