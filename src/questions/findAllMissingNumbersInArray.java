package questions;


// leetcode 448
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class missingNumber {
    static int solution(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        for(int num:arr){
            sum -= num;
        }
        return sum;
    }

}
