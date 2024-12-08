package Array_practice;

public class trapped_rainwater {

    public static int trappedRainwater(int h[]){
        //case 3 : atleast 3 bars with one samll bar in 2 unequal bars
        int n = h.length;
        int leftMax [] = new int [h.length];
        int rightMax[] = new int [h.length];
        // calculate leftmax boundary
        leftMax[0] = h[0];
        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(h[i],leftMax[i-1]);
        }

        //calculate rightmax Boundary
        rightMax[n-1] = h[n-1] ;
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(h[i],rightMax[i+1]);
        }

        int trapped_water = 0;
        for(int i = 0;i<n;i++){
            //calculate waterlevel
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //calculate trapped_water = waterLevel-height(bars);
            trapped_water += waterLevel - h[i];
        }
        return trapped_water ;

    }

    public static void main(String[] args) {
        int height [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped rainwater : "+trappedRainwater(height));
    }
}
