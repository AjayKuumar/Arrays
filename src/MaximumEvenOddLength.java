public class MaximumEvenOddLength {
    static int maximumEvenOddLength(int[] arr){
        int length = 1;
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]%2==0){
                if(arr[i]%2!=0){
                    length++;
                    res=Math.max(res,length);
                }else{
                    length=1;
                }

            }else{
                if(arr[i]%2==0){
                    length++;
                    res=Math.max(res,length);
                }else{
                    length=1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,13,19,5,25,30};
        System.out.println(maximumEvenOddLength(arr));
    }
}
