package pattern_part2;

public class triangle_0_1 {
    public static void triangle01(int n){
        for(int i =0;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        triangle01(5);
    }
}