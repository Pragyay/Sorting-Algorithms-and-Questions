package questions;

// leetcode 448
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class findAllMissingNumbersInArray {
    public static List<Integer> findDisappearedNumbers(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct_index = arr[i]-1;
            if(arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]-1!=j){
                list.add(j+1);
            }
        }
        return list;
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findDisappearedNumbers(arr));
    }

}
