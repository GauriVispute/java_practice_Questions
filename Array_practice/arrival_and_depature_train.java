package Arrays.Array_practice;

public class arrival_and_depature_train {

    public static void arrivalAndDepature(char arrival[],char depature[]){
    for( int i=0;i<arrival.length;i++)
        System.out.print(arrival[i]+" ");
    }

    public static void main(String[] args) {
        char arrival[] = {'9:00', '9:40', '9:50', '11:00', '15:00', '18:00'};
        char depature[] = {'9:10','12:00', '11:20', '11:30', '19:00', '20:00'};
        arrivalAndDepature(arrival,depature);

     // not understood
        
    }
}
