public class SearchingArray {
    static int search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,15,20,30,40,50,80,45};
        System.out.println(search(arr,15));
    }
}
