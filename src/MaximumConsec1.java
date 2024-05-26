public class MaximumConsec1 {
    static int maximumOnes(int[] arr){
        int count = 0;
        int maxCount=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=1){
                count=0;
            }
            else{
                count++;
                maxCount=Math.max(maxCount,count);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        System.out.println(maximumOnes(arr));
    }
}
