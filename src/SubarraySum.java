public class SubarraySum {
    static String subSum(int[] arr, int k){
        int start=0;
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            while(sum>k){
                sum-=arr[start];
                start++;
            }
            if (sum==k){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        System.out.println(subSum(arr,33));
    }
}
