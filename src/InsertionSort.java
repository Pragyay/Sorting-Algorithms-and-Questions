import java.util.Arrays;

public class InsertionSort {
    public static String sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int key = arr[i+1];
            int j;
            for(j=i+1;j>0;j--){
                if(arr[j-1]>key){
                    arr[j] = arr[j-1];
                }else{
                    break;
                }
            }
            arr[j] = key;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,10,12,1,5,6 };
        System.out.println(sort(arr));
    }
}
