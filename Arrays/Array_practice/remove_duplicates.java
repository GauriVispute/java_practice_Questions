package Arrays.Array_practice;

public class remove_duplicates {

    public static void printArray(int n[],int len){
        for(int i = 0;i<len;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static int removeDuplicateNumbers(int n []){
       int count = 0;
        for(int i = 1;i<n.length;i++){
            if(n[count] != n[i]){
                count++;
                n[count] = n[i];
            }
        }
        return count+1;
    }


    public static void main(String[] args) {
        //only for sorted array 
        int numbers[] = {1,2,2,3,3,3,4,4,4,5,6,6,7,8};

        printArray(numbers,numbers.length);
        int uniqueNo = removeDuplicateNumbers(numbers);
        printArray(numbers,uniqueNo);
    }

}
