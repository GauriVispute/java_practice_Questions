package pattern_part1.practice_patterns;

public class rhombus {
    public static void main(String[] args) {
        int n =5;
        for(int line =1;line<=5;line++){
            for (int spaces = 1; spaces < n-line+1; spaces++) {
                System.out.print(" ");
            }
            for (int star = 1; star <=n; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
