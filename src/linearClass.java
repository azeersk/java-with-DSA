public class linearClass {
    public static void linearSearch(int[] arr, int k){
        int a = arr.length;
        for(int i=0; i<a; i++){
            if (k == arr[i]){
                System.out.println("found at index "+i);
            }
        }
    }


    public static void main(String[] args){
        int[] arr = {12,23,34,45,56,67,78};
        int k = 34;
        linearSearch(arr,k);

    }
}
