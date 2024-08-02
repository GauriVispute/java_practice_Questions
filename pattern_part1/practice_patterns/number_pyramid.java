package pattern_part1.practice_patterns;

public class number_pyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int line=1;line<=n;line++){
            for(int spaces=1;spaces<n-line+1;spaces++){
                System.err.print(" ");
            }
            for(int number=line;number>=1;number--){
                System.out.print(number);
            }
            for(int number2 =1;number2 <line;number2++){
                System.out.print(number2+1);
            }
            System.out.println();
        }
    }
}
