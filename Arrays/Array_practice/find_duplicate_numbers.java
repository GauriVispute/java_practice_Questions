package Arrays.Array_practice;
// unsorted array 
// requires more revision  
public class find_duplicate_numbers{
   // static int [] duplicate = new int [5]; //global declaration

    public static void findDuplicateNumbers(int n []){
        int index=-1;
        int count=0;
        
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i] == n[j]){
                    count +=1;
                    index+=1;
                }
            }            
        }

        for(int i=0;i<.length;i++){
            if(count>=2){
                n[index];
            }
        }
    }

    public static void main(String [] args){
        int numbers[] = {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};
        findDuplicateNumbers(numbers);

        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}