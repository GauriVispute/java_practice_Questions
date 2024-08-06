package Arrays;

public class Linear_search {
    public static int find_key_index(int number[],int key){
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
        int key = 15;
        System.out.println("Key index in array number = "+find_key_index(number,key));;

    }
}
