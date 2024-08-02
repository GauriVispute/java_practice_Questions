package pattern_part2;

public class Inverted_half_pyramid {
    public static void invertedHalfPyramid_withNumbers(int n){
        for (int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramid_withNumbers(5);
    }
}
