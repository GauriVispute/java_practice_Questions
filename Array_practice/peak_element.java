p ackage Array_practice;

public class peak_element {

    public static int peakNumber(int n[]){
        int number = 0;
        for(int i=1;i<n.length;i++){
            if(n[i-1]<=n[i] && n[i+1]<=n[i]){
                number = n[i];
            }
        }
        return number;
    }

    public static void main(String [] args){
        int numbers[] = {10, 20, 15, 2, 23, 90, 67};
        System.out.print("Peak Element = "+peakNumber(numbers));
    }
}
