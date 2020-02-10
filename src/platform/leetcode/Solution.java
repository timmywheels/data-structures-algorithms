package platform.leetcode;

class Solution {

    public boolean laterPriceIndexIsGreater(int[] arr, int earlierPrice, int laterPrice) {

//        if (arr.indexOf(earlierPrice) > arr.indexOf(laterPrice)) {
//            return false;
//        }
        return true;
    }

    public int maxProfit(int[] prices) {

        int largestDifference = 0;
        int highestNumber = 0;
        int lowestNumber = 0;
        boolean priceComesAfter = false;


        for (int i = 0; i < prices.length -1; i++) {
            if (prices[i] > largestDifference && laterPriceIndexIsGreater(prices, prices[i], prices[largestDifference])) {
                largestDifference = prices[i];
            }

        }

        return largestDifference;

        // loop thru array
        // bool comesAfter
        // find highest
        // find lowest

        // if highest is after


        // get biggest gap between



    }
}