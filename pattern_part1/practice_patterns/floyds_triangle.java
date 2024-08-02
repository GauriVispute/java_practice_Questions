package pattern_part1.practice_patterns;

public class floyds_triangle {
    public static void main(String [] args){
        int n=10;
        int N=1;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(N+" ");
                N++;
            }
            System.out.println();
        }

    }
}
