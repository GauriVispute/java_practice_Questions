package Array_practice;

public class missing_and_repeating_no{

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void missingAndReapeatingNo(int n[]){
        int num = 0;
        int repeatingNo = 0;
        for(int i = 0 ;i<=n.length;i++){
            int count = 1;
            for(int j=i+1;j<n.length;j++){//check
                if(n[i] == n[j]){
                    repeatingNo=n[j];
                    count++;
                }
            }
            if(count>=2){
                System.out.println("Repeating number : "+repeatingNo);
                break;
            }
        }
       
        for(int i=0;i<n.length;i++){// numbers = 1 to n
            boolean isFound = false;
            for(int j=0;j<n.length;j++){
                if(i+1 == n[j]){
                    isFound = true;
                    break;
                } 
            }
            if(isFound == false){
                System.out.println("Missing Number : "+(i+1));
                break;
            }
        }
        
    }

    public static void main(String[] args) {
        //int numbers []={4, 3, 6, 2, 1, 1};
        int numbers [] = {2,1,3,7,4,7};
        missingAndReapeatingNo(numbers);
    }
}

//hold