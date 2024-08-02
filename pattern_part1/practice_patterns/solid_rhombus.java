package pattern_part1.practice_patterns;

public class solid_rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int line=1;line<=n;line++){
            for(int spaces=1;spaces<n-line+1;spaces++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            for(int in_star=1;in_star<n-line+1;in_star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
