public class MaximumSubarraySum {
    static int maximumSum(int[] arr){
        int res = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxSum = Math.max(maxSum+arr[i],arr[i]);
            res = Math.max(res, maxSum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={-5,1,-2,3,-1,2,-2};
        System.out.println(maximumSum(arr));
    }
}
