package questions;

//leetcode 41
//https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
    public static int solution(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length){
                if(arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else i++;
            }else i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]-1 != j){
                return j+1;
            }
        }
        return arr[arr.length-1]+1;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,9,11,1,2,2};
        System.out.println(solution(arr));
    }
}
