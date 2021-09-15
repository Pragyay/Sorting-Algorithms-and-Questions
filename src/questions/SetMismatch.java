package questions;

import java.util.Arrays;

//leetcode 645
// https://leetcode.com/problems/set-mismatch/

public class SetMismatch {
    static int[] findErrorNums(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else i++;
        }
        int[] ans = new int[2];
        for(int j=0;j<arr.length;j++){
            if(arr[j]-1 != j){
                ans[0] = arr[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,2,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
