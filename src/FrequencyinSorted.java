public class FrequencyinSorted {
    static void frequency(int[] arr){
        int count=1;
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                System.out.println("Count of "+arr[i-1]+" is: "+count);
                count=1;
            }
        }
        System.out.println("Count of "+arr[arr.length-1]+" is: "+count);
        //This is for last element frequency as count is loaded but it is not printed so we print seperately for it.

    }

    public static void main(String[] args) {
        int[] arr={10,10,10,20,20};
        frequency(arr);
    }
}
