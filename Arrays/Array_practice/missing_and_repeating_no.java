package Arrays.Array_practice;

public class missing_and_repeating_no{

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void missingAndReapeatingNo(int n[]){
        int num = 0;
        int number[] =new int[1];
        for(int i = 1 ;i<=n.length;i++){
            int count = 0;
            for(int j=i;j<n.length;j++){//check
                if((i+1) == n[j]){
                    num=n[j];
                    count++;
                }
            }
            if(count>=2){
                number[0] = num;
            }
        }
        System.out.println(number[0]);
        //for()
    }

    public static void main(String[] args) {
        int numbers []={4, 3, 6, 2, 1, 1};
        missingAndReapeatingNo(numbers);
    }
}

//hold