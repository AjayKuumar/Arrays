public class SecondLargest {
    static int secondLargest(int[] arr){
        int firstMax=arr[0];
        int secondMax=-1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }else{
                if(arr[i]<firstMax && arr[i]>secondMax){
                    secondMax=arr[i];
                }
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int [] arr={10,10,10,15,2,42,8};
        System.out.println(secondLargest(arr));
    }
}
