public class MaximumDifference {
    static int maximumDifference(int[] arr){
        int minVal = arr[0];
        int res = Integer.MIN_VALUE;
        for (int i = 1; i <arr.length ; i++) {
            res = Math.max(res,arr[i]-minVal);
            minVal =Math.min(minVal,arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,12,3,6,4,8,1};
        System.out.println(maximumDifference(arr));
    }
}
