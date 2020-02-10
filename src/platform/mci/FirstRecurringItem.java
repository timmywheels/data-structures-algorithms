package platform.mci;

import java.util.HashMap;

public class FirstRecurringItem {

    public int firstRecurringItem(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int firstRecurringItem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsValue(arr[i])) {
                firstRecurringItem = arr[i];
                break;
            }
            map.put(i,arr[i]);
        }
        System.out.println("firstRecurringItem: " + firstRecurringItem);
        return firstRecurringItem;
    }
}
