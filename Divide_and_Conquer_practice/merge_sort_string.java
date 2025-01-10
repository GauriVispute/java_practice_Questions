package Divide_and_Conquer_practice;

public class merge_sort_string {
    public static boolean isAlphabeticSmaller(String s1,String s2){
        if(s1.compareTo(s2) < 0){//accending order 1st letter 
            return true;
        }
        return false;
    }
    public static void merge(String str[],int si,int mid,int ei){
        String temp[] =new String [ei-si+1];
        int i = 0 ; //operator of left 
        int j=mid+1; //operator of right
        int k = 0; //operator temp String array

        while(i<=mid && j<=ei){
            if(isAlphabeticSmaller(str[i],str[j])){// 
                temp[k] = str[i];
                i++;
            } else{ // arr[i]>arr[j]
                temp[k] = str[j];
                j++;
            }
            k++;
        }

        // for remaining values 
        //left
        while(i<=mid){
            temp[k++] = str[i++];
        }
        
        //right
        while(j<=ei){
            temp[k++] = str[j++];
        }

        //copy temp arr to it origitnal array
        i=si;
        for(k=0;k<str.length;k++){
            temp[k] = str[i++];
        }
    }

    public static void mergeSort(String str[],int si,int ei){
        if(si>=ei){// single element
            return;
        }

        int mid = si+(ei-si)/2;

        //divid untill we get single element
        mergeSort(str,si,mid);//left
        mergeSort(str,mid+1,ei);//right

        //combine 
        merge(str,si,mid,ei);
    }

    public static void main(String[] args) {
        String arr [] = {"sun","earth","mars","mercury"};
        mergeSort(arr,0,arr.length-1); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}