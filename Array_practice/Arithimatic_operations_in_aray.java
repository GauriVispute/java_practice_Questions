package Arrays.Array_practice;

import java.util.*;

public class Arithimatic_operations_in_aray {
    public static int g_var; // global variable

    public static void  printArray(int n[]){
        for(int i=0 ;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static int sum(int n[]){
        int sum =0;
        for (int i=0 ;i<n.length;i++){
            sum+=n[i];
        }
        return sum;
    }
    
    public static int average(int n[]){
        return sum(n)/n.length;
    }

    public static void multipy_each_specific_no(int n[]){

        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        g_var = sc.nextInt();

        for(int i =0 ;i<n.length;i++){
            n[i] *= g_var;      //n[i] = n[i]*g_var;
        }

        System.out.print("Current Changed  array : ");
        printArray(n);
    }
   
    public static void subtract_by_specific_no(int n[]){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        g_var = sc.nextInt();

        for(int i =0;i<n.length;i++){
            n[i] -= g_var ; // n[i] = n[i] - g_var;
        }

        System.out.print("Current  Changed Array : ");
        printArray(n);
    }

    public static void divide_by_specific_no(int n[]){
            
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        g_var = sc.nextInt();

        for(int i =0 ;i<n.length;i++){
            n[i] /= g_var ; 
        }

        System.out.print("Current Array : ");
        printArray(n);
    }

    public static void modulo_by_specific_no(int n[]){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        g_var = sc.nextInt();

        for(int i =0 ;i<n.length;i++){
            n[i] %= g_var;  // n[i] = n[i] % g_var;
        }

        System.out.print("Current Array : ");
        printArray(n);

    }

    public static void main(String[] args) {
        int numbers []=  {5,2,4,9,8};
        
        System.out.print("Taken array : ");
        printArray(numbers);
        System.out.println();

        System.out.println("Sum of numbers in array = "+sum(numbers));
        System.out.println("Average of numbers in arrays : "+average(numbers));
        System.out.println("Multipy each number by specific number ");
        multipy_each_specific_no(numbers);
        System.out.println("\nSubtracted by specific number : ");
        subtract_by_specific_no(numbers);
        System.out.println("\nDivide by specific number : ");
        divide_by_specific_no(numbers);
        System.out.println("\nModulo by specific number ; ");
        modulo_by_specific_no(numbers);
                
    }
}