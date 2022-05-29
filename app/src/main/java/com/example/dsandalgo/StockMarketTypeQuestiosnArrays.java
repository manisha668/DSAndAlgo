package com.example.dsandalgo;

public class StockMarketTypeQuestiosnArrays {

    //problem 1
           /** Today is Sunday and Disha is out for the shopping. She has reached to the famous
            market of the city. She has a list of items which she wants to buy but she has a very low
            amount of cash today and no shop accepts any online payment method in the market.
             Disha has only D rupees with her and wants to buy N items (she wants to buy as many
             units of item as possible). She wants to shop in a way such that first she buy 1
             quantity of all the items she wants to buy and then she will move to buy 2nd quantity of any item.

             Can you help her by calculating how many items she can buy today if she shops optimally?

             You are given an array which represents the price of items Disha wants to buy
             example - :
            If she wants to buy 4 items having price 4, 6, 2, 5 respectively and has 49 rupees only
            then she will buy in this order:- 1st item, 2nd item, 3rd item, 4th item (It will cost 17 rupees).
            Again she will buy in this order 1st, 2nd, 3rd, 4th (it will cost 17 rupees). Now, she
            has remaining 15 rupees so she can buy any 3 items.
          */

      //problem 2

    /** stock buy sell to maximum profit
    * The cost of a stock on each day is given in an array, find the max profit that you can make by
    *  buying and selling in those days. For example, if the given array is {100, 180, 260, 310, 40,
    *  535, 695}, the maximum profit can earned by buying on day 0, selling on day 3. Again buy on
    * day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit
    *  cannot be earned at all.*/

    //solution tp problem 2

    public int getMaxSales(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int j : arr) {
            if (j < min)
                min = j;
            else if (j - min > max)
                max = j - min;
        }
        return max;
    }
}
