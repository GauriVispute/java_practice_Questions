package recursion_practice;

public class count_consonants_in_string {
    public static void countConsonants(String str,int i,int count){
        if(i == str.length()){
            System.out.println(count);
            return;
        }
        //kaam
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            countConsonants(str,i+1,count+1);
        } else{
            countConsonants(str,i+1,count);
        }
        

    }

    public static void main(String[] args) {
        countConsonants("gauri vispute",0,0);
    }
}