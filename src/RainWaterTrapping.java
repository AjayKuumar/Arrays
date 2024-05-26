public class RainWaterTrapping {
    static int rainwater(int[] bars){
        int[] lMax= new int[bars.length];
        int[] rmax = new int[bars.length];
        int res = 0;
        lMax[0] = bars[0];
        for (int i = 1; i <bars.length ; i++) {
            lMax[i]=Math.max(bars[i],bars[i-1]);
        }

        rmax[rmax.length-1]=bars[bars.length-1];
        for (int i = bars.length-2; i >=0 ; i--) {
            rmax[i]=Math.max(bars[i],bars[i+1]);
        }

        for (int i = 1; i < bars.length-1; i++) {
            res+= Math.min(lMax[i],rmax[i])-bars[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={5,0,6,2,3};
        System.out.println(rainwater(arr));
    }
}
