package pattern_part2;

public class Floys_triangle {
    public static void floydsTriangle(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++ ){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        floydsTriangle(4);
    }
}
