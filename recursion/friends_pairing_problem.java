package recursion;

public class friends_pairing_problem {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2); 
        // //choice
        // //single
        // int fnm1 = friendsPairing(n-1);
        // //pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1)*fnm2;

        // int totalWays = fnm1+pairWays;
        // return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}