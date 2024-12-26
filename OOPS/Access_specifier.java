package OOPS;

public class Access_specifier {
   public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "GauriVispute";
        myAcc.setPassword("123456789");
        
   }
}

class BankAccount{
    public String username;
    private String password; 

    default void setPassword(String pwd){
        password = pwd;
    }
    
}