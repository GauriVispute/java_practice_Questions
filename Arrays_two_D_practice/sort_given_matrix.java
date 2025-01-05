package Arrays_two_D_practice;

public class sort_given_matrix {
    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    //take 2d array into 1d array
    public static void sortMatrix(int matrix [][]){
        int n[] = new int [matrix.length*matrix[0].length];
        int k =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                n[k] = matrix[i][j];
                k++;
            }
        }

        //Display 2D to 1D
        printArray(n);

        //applying selection sort in 1D array

        for(int i=0;i<n.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<n.length;j++){
                if(n[minPos]>n[j]){
                    minPos = j;
                }
            }
            //swaping
            int temp = n[minPos];
            n[minPos] = n[i];
            n[i] = temp;
        }

        // displaying sorted 1d array
        printArray(n);

        k = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j] = n[k];
                k++;
            }
        }

        System.out.println("Sorted Matrix : ");
        printMatrix(matrix);
    
    }

    public static void main(String[] args) {
        int matrix[][] = {{2,3,4,11},
                          {7,5,1,13},
                          {6,9,8,12}};

        sortMatrix(matrix);
    }
}
