package pattern_part1.practice_patterns;

public class hollo_rectangle {
    public static void main(String[] args) {
        int m=4;
        int n=5;
        for(int line = 1;line<=m;line++){
            for(int star =1;star<=n;star++){
                if (line==1 || line==m || star==1 || star==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    }
}
