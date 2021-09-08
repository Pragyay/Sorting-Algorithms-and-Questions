import java.util.Arrays;

public class SelectionSort {
    static String selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = arr[i];
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[min_index] = temp;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] arr = {34,5,21,7,4,33,2,1,-6,0,56,55,332};
        System.out.println(selectionSort(arr));
    }
}
