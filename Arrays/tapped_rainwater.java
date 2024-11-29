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
        }

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
       
       int trapped_water = 0;
        for(int i = 0;i<h.length;i++){
           // calculating the minimum of both leftMaxBoundary and rightMaxBoundary
            int waterlevel= Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);

           //calculating tapped water = waterlevel - height(bars);
             trapped_water += (waterlevel - h[i]);
        }
        System.out.println("Trapped rainwater : "+trapped_water);
    }
    public static void main(String[] args) {
        int height [] = {4,2,0,6,3,2,5};
        tappedRainwater(height);
    }
}
