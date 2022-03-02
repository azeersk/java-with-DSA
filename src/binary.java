import java.util.Arrays;

public class binary {
    public static int binarySearch(int[] arr, int k){
        int l = arr.length;
        System.out.println(l);
        int start = 0;
        int end = l-1;
        for(int i=0; i<13; i++){
            int mid = (start + end)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                start = mid;
            }
            else{
                end++;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {12,23,69,38,34,77,45,56,67,78,89,33};
        Arrays.sort(arr);
        System.out.println("array after sorting: "+Arrays.toString(arr));
        System.out.println();
        int k = 67;
        int result = binarySearch(arr,k);

        if(result == -1){
            System.out.println("k is not found!");
        }
        else{
            System.out.println("k is found at the index of: "+result);
        }

    }
}
