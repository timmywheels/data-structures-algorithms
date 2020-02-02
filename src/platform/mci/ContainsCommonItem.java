package platform.mci;

import java.util.HashMap;

public class ContainsCommonItem {

    public boolean containsCommonItem(String[] arr1, String[] arr2) {

        HashMap<String, Boolean> hashMap = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!hashMap.containsKey(i)) {
                Boolean item = hashMap.put(arr1[i], true);

            }
        }

        return true;
    }

}
