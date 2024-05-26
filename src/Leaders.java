public class Leaders {
    static void leader(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]>=max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={7,10,4,10,6,5,2};
        leader(arr);
        //if you want to print elements from left to right copy them to array and reverse the array then print them

    }
}
