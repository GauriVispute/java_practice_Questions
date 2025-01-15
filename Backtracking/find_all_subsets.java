package Backtracking;

public class find_all_subsets {
    public static void findSubsets(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println(null);
            }else {
                System.out.println(ans);
            }
            return ;
        }
        //choice-> Y
        findSubsets(str,i+1,ans+str.charAt(i));
        
        // choice -> N
        findSubsets(str,i+1,ans);

    }
    public static void main(String[] args) {
        String str  = "abc";
        findSubsets(str,0,"");
    }
}