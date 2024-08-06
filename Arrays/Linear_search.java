package Arrays;

public class Linear_search {
    public static int linearSearch(int number[],int key){
        for (int i =0;i<number.length;i++){
            if(number[i] == key){
                //retrun the specific index
                return i;
            }
        }
        //if did match then return -1
        return -1;
    }

    public static void main(String[] args) {
        int number [] = {2,4,6,8,10,12,14,16};
        int key = 10;
        System.out.println("Key's index in array = "+linearSearch(number,key));;

    }
}
