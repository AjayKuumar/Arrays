import java.util.Arrays;

public class MovesZeroestoEnd {
    static int[] moveZeroes(int[] arr){
        int req=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==0){
                break;
            }
            req++;
        }
        int start =req+1;
        for (int i = start; i <arr.length ; i++) {
            if(arr[i]!=0){
                int temp=arr[req];
                arr[req]=arr[i];
                arr[i]=temp;
                req++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={10,20};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
}
