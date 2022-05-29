package com.example.dsandalgo;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//code to calculate the sum of an hour glass...hackerrank/geeks for geeks
class Result {

    public static int hourglassSum(List<List<Integer>> arr) {
        int r = 6, c = 6;
        if(r<3 || c<3) return -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <= r-3 ; i++){
            for(int j = 0 ; j <= c-3 ; j++){
                int sum = (arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2))+
                        arr.get(i+1).get(j+1) + (arr.get(i+2).get(j) + arr.get(i+2).get(j+1) +
                        arr.get(i+2).get(j+2));

                max = Math.max(max, sum);
            }
        }
        return max;
    }

}

 class Solution {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) throws IOException {

//            int [][]mat = {{1, 2, 3, 0, 0},
//                    {0, 0, 0, 0, 0},
//                    {2, 1, 4, 0, 0},
//                    {0, 0, 0, 0, 0},
//                    {1, 1, 0, 1, 0}};

        // List of Lists
        ArrayList<List<Integer> > listOfLists
                = new ArrayList<List<Integer> >();

        // Create N lists one by one
        // and append to the list of lists
        List<Integer> list1
                = new ArrayList<Integer>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(0);
        list1.add(0);
        list1.add(0);
        listOfLists.add(list1);

        List<Integer> list2
                = new ArrayList<Integer>();
        list2.add(0);
        list2.add(1);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        listOfLists.add(list2);

        List<Integer> list3
                = new ArrayList<Integer>();
        list3.add(1);
        list3.add(1);
        list3.add(1);
        list3.add(0);
        list3.add(0);
        list3.add(0);
        listOfLists.add(list3);

        List<Integer> list4
                = new ArrayList<Integer>();
        list4.add(0);
        list4.add(0);
        list4.add(2);
        list4.add(4);
        list4.add(4);
        list4.add(0);
        listOfLists.add(list4);

        List<Integer> list5
                = new ArrayList<Integer>();
        list5.add(0);
        list5.add(0);
        list5.add(0);
        list5.add(2);
        list5.add(0);
        list5.add(0);
        listOfLists.add(list5);

        List<Integer> list6
                = new ArrayList<Integer>();
        list6.add(0);
        list6.add(0);
        list6.add(1);
        list6.add(2);
        list6.add(4);
        list6.add(0);
        listOfLists.add(list6);
            int res = Result.hourglassSum(listOfLists);
            if (res == -1)
                System.out.println("Not possible");
            else
                System.out.println("Maximum sum of hour glass = "
                        + res);

            StockMarketTypeQuestiosnArrays obj = new StockMarketTypeQuestiosnArrays();
            int[] arr = {7,1,5,3,6,4};
            obj.getMaxSales(arr);
        }

}
