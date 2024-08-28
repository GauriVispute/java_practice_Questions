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

    public static void traverse(int n []){
        for (int i =0 ;i<size;i++)
           System.out.print(n[i]+" "); 
    }
 
    
    public static void Insert(int n[]){

        System.out.print("Enter number ");
        int number = sc.nextInt();

        System.out.print("Enter the index :");
        index = sc.nextInt();

        // element at beginning (head)
        if(index == 0){
          /*
          n = array size 
          so size is n+1
           */  
          size++;
          
          for(int i=size-1;i>index;i--){
           n[i] = n[i-1];   //n[5]=n[4]
          } 

            n[index] = number;

        }
        traverse(n);

        //element at end (tail)

        // element in  in-between

    }


    public static void main(String[] args) {
        
        System.out.print("Enter size of array : ");
        size = sc.nextInt();
        int number[] = new int [size+1] ;
        
        System.out.print("Enter "+size+" number : ");
        for (int i =0 ;i<size;i++){
            number[i] = sc.nextInt();
        }
        System.out.print("size of array : "+number.length);
        Insert(number);
    }

}