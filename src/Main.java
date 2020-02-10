import platform.mci.ContainsCommonItem;
import platform.mci.FirstRecurringItem;
import platform.mci.HasPairWithSum;

public class Main {

    public static void main(String[] args) {

        FirstRecurringItem firstRecurringItem = new FirstRecurringItem();

        firstRecurringItem.firstRecurringItem(new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4});
        firstRecurringItem.firstRecurringItem(new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4});

//        ContainsCommonItem containsCommonItem = new ContainsCommonItem();

//        String[] array1 = new String[]{"a", "b", "c", "z"};
//        String[] array2 = new String[]{"z", "y", "x", "w"};

//        containsCommonItem.containsCommonItem(array1, array2);


//        HasPairWithSum hasPairWithSum = new HasPairWithSum();
//        hasPairWithSum.hasPairWithSum(new int[]{6,4,3,2,1,7}, 9);
//        hasPairWithSum.hasPairWithSumRefactored(new int[]{6,4,3,2,1,7}, 9);


    }
}
