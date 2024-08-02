package function;

public class fun_overloading_dataType {
   public static int sum(int a,int b){
        return a+b;
   }
   public static float sum(float a,float b){
    return a+b;
   }

   public static  void main(String []args){
        System.out.println("Sum of 2 int values : "+sum(5,4));
        System.out.println("Sum of 2 float values : "+sum(5.0f,3.0f));
   }
}
