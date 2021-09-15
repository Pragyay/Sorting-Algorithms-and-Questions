import java.util.Arrays;

public class CycleSort {
    public static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (correct_index != i) {
                swap(arr, correct_index, i);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr= {4,2,6,3,1,5,7};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
