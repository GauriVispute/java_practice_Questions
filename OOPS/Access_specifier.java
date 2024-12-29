package OOPS;

public class Access_specifier {
   public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "GauriVispute";
        System.out.println(myAcc.username);
        myAcc.setPassword("123456789");
        
   }
}
// Ecapsulation
class BankAccount{
    public String username;
    private String password; 

    protected void setPassword(String pwd){
        password = pwd;
    }    
}