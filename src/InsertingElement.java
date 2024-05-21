import java.util.Arrays;

public class InsertingElement {
    static int[] insertArray(int[] arr,int x, int pos,int cap,int n){
        if(n==cap){
            return arr;
        }
        int idx=pos-1;
        for(int i=n-1;i>=idx;i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr= new int[6];
        arr[0]=10;
        arr[1]=15;
        arr[2]=12;
        System.out.println(Arrays.toString(insertArray(arr,25,2,5,3)));
    }
}
