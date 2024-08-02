package function;

public class Binary_to_decimal {
    public static void  binaryToDecimal(int binNum){
        int myNumber=binNum;
        int power=0;
        int decimal = 0;
        
        while(binNum>0){
            int last_no = binNum%10;
            decimal = decimal+(last_no* (int) Math.pow(2,power));
            power++;
            binNum=binNum/10;
        }
        System.out.println("Decimal number of "+myNumber+" = "+decimal);
    }
    public static void main(String[] args) {
        binaryToDecimal(101);
    }
}