package function;

public class fun_overloading {
    //function overloading
    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void  main(String [] args){
        System.out.println("Sum of two number = "+sum(5,2));
        System.out.println("Sum of three numbers = "+sum(4,5,3));
    }
}
