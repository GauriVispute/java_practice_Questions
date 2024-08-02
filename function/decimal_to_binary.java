package function;

public class decimal_to_binary {
    public static void deciToBin(int n){
        int myNum=n;
        int bin=0;
        int power = 0;
        while(n>0){
            //int quocient = n/2;
            int rem = n%2;
            bin = bin+ rem* (int) Math.pow(10,power);
            power++;
            n = n/2;
        }
       System.out.println("binary of "+myNum+" = "+bin);
    }

    public static void main(String[] args) {
        deciToBin(15);
    }
}