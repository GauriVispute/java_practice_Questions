package Arrays;

import java.util.*;

public class Input_output {
    public static void main(String[] args) {
        int marks[] = new int [100];

        Scanner sc  = new Scanner(System.in);
            // int phy;
            // phy = sc.nextInt();
            
            
            marks[0] = sc.nextInt();    // phy
            marks[1] = sc.nextInt();    // chem
            marks[2] = sc.nextInt();    //math
            
            
            //display
            System.out.println("Phy = "+marks[0]);
            System.out.println("Chem = "+marks[1]);
            System.out.println("math = "+marks[2]);
            
            int percentage = (marks[0]+marks[1]+marks[2])/3;
            System.out.println("Percentage = "+percentage+"%");
            

        System.out.println("length of Array marks size = "+marks.length);
    }
}
