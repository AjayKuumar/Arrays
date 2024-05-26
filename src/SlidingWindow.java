public class SlidingWindow {
    static int slidingWindowSum(int[] arr, int k){
        int res = 0;
        int sum =0;
        int i = 0;
        while(i<k){
            sum+=arr[i];
            i++;
        }
        for (int j = k; j <arr.length ; j++) {
            sum+=(arr[j]-arr[j-k]);
            res=Math.max(res,sum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(slidingWindowSum(arr,4));
    }
}
