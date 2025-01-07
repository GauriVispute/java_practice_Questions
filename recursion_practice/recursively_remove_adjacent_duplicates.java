package recursion_practice;

public class recursively_remove_adjacent_duplicates {

    public static void recursivelyRemoveAdjacentDuplicates(StringBuilder sb,int prev,int start,int end){
        if(start == end+1){
            System.out.println(sb.toString());
            return ;
        }
        //kaam
        if(sb.charAt(start) == sb.charAt(start+1)){
            sb.delete(sb.charAt(start),sb.charAt(start+2));
            recursivelyRemoveAdjacentDuplicates(sb,prev,prev+1,end);
        } else{
            recursivelyRemoveAdjacentDuplicates(sb, prev+1, start+1, end);
        }
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        recursivelyRemoveAdjacentDuplicates(new StringBuilder(str), -1, 0,str.length()-1);
    }
}
