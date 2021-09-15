package questions;

//leetcode 442
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicatesInArray {
    static List<Integer> findDuplicates(int[] arr){
       int i=0;
       while(i<arr.length){
           int correct = arr[i]-1;
           if(arr[i] != arr[correct]){
               swap(arr,i,correct);
           }else i++;
       }
       List<Integer> list = new ArrayList<Integer>();
       for(int j=0;j<arr.length;j++){
           if(arr[j]-1 != j){
               list.add(arr[j]);
           }
        }
       return list;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

}
