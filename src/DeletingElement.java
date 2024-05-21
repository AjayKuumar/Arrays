import java.util.Arrays;

public class DeletingElement {
    static int[] deleteArray(int[] arr, int x, int cap, int n){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=x){
                i++;
            }
            else{
                break;
            }
        }
        if(i==cap){
            return arr;
        }
        for (int j = i; j <n-1 ; j++) {
            arr[j]=arr[j+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={10,250,40,50,15};
        System.out.println(Arrays.toString(deleteArray(arr,40,5,5)));
    }
}
