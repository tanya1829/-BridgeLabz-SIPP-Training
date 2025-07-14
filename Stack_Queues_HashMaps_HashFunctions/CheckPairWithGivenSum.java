package Stack_Queues_HashMaps_HashFunctions;
import java.util.*;
public class CheckPairWithGivenSum {
     public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        System.out.println("Has pair with sum " + target + ": " + hasPairWithSum(arr, target));
    }
} 

