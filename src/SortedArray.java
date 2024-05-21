public class SortedArray {
    static String sortedArray(int[] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<arr[i]){
                flag = false;
            }
        }
        if (flag){
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        int[] arr={10,10,10,20,30,50,10};
        System.out.println(sortedArray(arr));
    }
}
