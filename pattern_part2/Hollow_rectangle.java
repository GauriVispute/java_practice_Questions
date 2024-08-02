package pattern_part2;

public class Hollow_rectangle {
    public static void hollowRectangle(int totRows,int totCols){
        //outer loop
        for (int i = 1;i<=totRows;i++){
           // innrer ->colums
            for(int j =1;j<=totCols;j++){
                //cell =(i,j)
                if(i==1 || i==totRows ||  j==1 || j==totCols){
                    // boundary cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
         System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(4,5);
    }
}