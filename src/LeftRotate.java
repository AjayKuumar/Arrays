import java.util.Arrays;

public class LeftRotate {
    static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void leftRotate(int[] arr,int d){
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,arr.length-1);
        reverseArray(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        leftRotate(arr,1);
        System.out.println(Arrays.toString(arr));
    }
}
