package platform.mci;

import java.util.HashMap;

public class HasPairWithSum {

    public boolean hasPairWithSum(int[] arr, int sum) {
        int lengthMinusOne = arr.length - 1;
        for (int i = 0; i < lengthMinusOne; i++) {
            for (int j = 1; j < lengthMinusOne; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Match! - arr[i]: " + arr[i] + " and arr[j]: " + arr[j] + " equals " + sum);
                    return true;
                }
            }
        }
        System.out.println("No match!");
        return false;
    }

    public boolean hasPairWithSumRefactored(int[] arr, int sum) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsValue(arr[i])) {
                System.out.println("Hashmap contains " + arr[i]);
                return true;
            }
            hashMap.put(i, sum - arr[i]);
            System.out.println("Added " + arr[i] + " to Hashmap");
        }
        return false;
    }


}
