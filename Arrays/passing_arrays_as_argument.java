package Arrays;

public class passing_arrays_as_argument {

    public static void update(int marks[],int notchange){
        notchange = 15;
        for(int i = 0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int notchange = 10;
        update(marks,notchange);

        System.out.println("notchange = "+notchange);
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

        /* Note : in java
        Arrays are passed by reference 
        variables are pass by value in method and it will never change it's main method declared/assigned value
        */
        
        System.out.println();
    }
}
