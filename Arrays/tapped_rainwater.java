package Arrays;

public class tapped_rainwater {
    public static void tappedRainwater(int h []){
        //auxiliary array
        int leftMaxBoundary[] = new int [h.length];
        int rightMaxBoundary[] = new int [h.length];

        int max = Integer.MIN_VALUE;
        for(int i =0;i<h.length;i++){
            if(h[i]>max){
                max = h[i];
                leftMaxBoundary[i]=h[i];
            }else{
                leftMaxBoundary[i] = max;
            }
           // System.out.print(leftMaxBoundary[i]+" ");
        }
        //System.out.println();
        max = Integer.MIN_VALUE;
        int len = h.length;
        for(int i=0;i<len;i++){
            if(h[(h.length-1)-i]>max){
                max = h[(h.length-1)-i];
                rightMaxBoundary[h.length-1-i] = h[(h.length-1)-i] ;
            }else{
                rightMaxBoundary[h.length-1-i] = max;
            }
        }

        // for(int i = 0;i<h.length;i++){
        //     System.out.print(rightMaxBoundary[i]+" ");
        // }

        // calculating the minimum of both leftMaxBoundary and rightMaxBoundary
        int minimumBoundary[] = new int [h.length];
        for(int i = 0;i<minimumBoundary.length;i++){
            minimumBoundary[i]= Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
           // System.out.print(minimum[i]+" ");
        }

        // trapped_water= waterlevel-height;
        int trapped_water[] = new int [h.length];
        int trappedWater = 0; 
        for(int i = 0;i<trapped_water.length;i++){
           trapped_water[i] =  minimumBoundary[i]-h[i];
           trappedWater+=trapped_water[i];
        }
System.out.println("Trapped rainwater : "+trappedWater);

    }
    public static void main(String[] args) {
        int height [] = {4,2,0,6,3,2,5};
        tappedRainwater(height);
    }
}
