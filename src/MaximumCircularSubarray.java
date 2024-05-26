public class MaximumCircularSubarray {
    static int maximumCircularSUm(int[] arr){
        int res;
        int arr_normal = MaximumSubarraySum.maximumSum(arr);
        if (arr_normal<0){
            return arr_normal;
        }
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum+=arr[i];
            arr[i]= -arr[i];
        }
        int arr_circular = arr_sum+MaximumSubarraySum.maximumSum(arr);
        res=Math.max(arr_normal,arr_circular);
        return res;
    }

    public static void main(String[] args) {
        int[] arr= {10, -3, -4, 7, 6, 5, -4, -1};
        System.out.println(maximumCircularSUm(arr));
    }
}
