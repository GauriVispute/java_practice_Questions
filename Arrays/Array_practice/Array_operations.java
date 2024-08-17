package Arrays.Array_practice;

import java.util.*;

public class Array_operations {
    
    static Scanner sc = new Scanner(System.in);

    public static int size = 5; //global array size that we can change after 
    static int index;    // default value is zero


    public static void printMenu(){
        System.out.println("Menu : ");
        System.out.println("1] Insert an element");
        System.out.println("2] Deleting an element");
        System.out.println("3] Travers an array");
    }
 
    @SuppressWarnings("unused")
    public static void Insert(int n[]){

        System.out.println("Enter number ");
        int number = sc.nextInt();

        System.out.println("Enter the index :");
        index = sc.nextInt();

        


        // element at beginning (head)
        if(index == 0){
            size++;

        }

        //element at end (tail)

        // element in  in-between

    }


    public static void main(String[] args) {
        System.out.println(index);
    }

}
