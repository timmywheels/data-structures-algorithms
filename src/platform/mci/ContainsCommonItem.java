package platform.mci;

import java.util.HashMap;

public class ContainsCommonItem {

    public boolean containsCommonItem(String[] arr1, String[] arr2) {

        HashMap<String, Boolean> hashMap = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!hashMap.containsKey(arr1[i])) {
                System.out.println("Added " + arr1[i] + " to hashMap");
                Boolean item = hashMap.put(arr1[i], true);
            }
        }

        for (int j = 0; j < arr2.length; j++){
            if (hashMap.containsKey(arr2[j])) {
                System.out.println("Found  " + arr2[j] + " in hashMap");
                return true;
            }
            return false;
        }

        System.out.println(hashMap);
        return true;
    }

}