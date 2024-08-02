package pattern_part2;

public class Butterfly_pattern {
    public static void butterflyPattern(int n){
        //1st half 
        for(int i=1;i<=n;i++){
            //stars
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n;i>=1;i--){
            //stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterflyPattern(4);
    }
}
