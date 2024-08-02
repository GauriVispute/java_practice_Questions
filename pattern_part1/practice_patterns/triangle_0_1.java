package pattern_part1.practice_patterns;

public class triangle_0_1 {
    public static void main(String[] args) {
        int n=5;
        /*
        for (int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                //Odd lines
                if(!(line%2==0)){
                    if(!(number%2==0)){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                } 
                //Even lines
                else{
                    if (number%2==0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }*/
        for(int line=1;line<=n;line++){
            for(int number =1;number<=line;number++){
                if((line+number)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}
