package OOPS;

public class constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.marks
        Student s2 = new Student("Gauri");
        Student s3 = new Student(12); 


        //Student s4 = new Student("aditya",56);
        //System.out.println(s1.name);
    }
}

class Student{
    private String name;
    int rollno;


    //non-parameterized constructor
    Student(){
        //constructor 
        //no contructor then java will made it automatically
        // doesn't have return type
        // for Intialization we need manke Constructor
        // you can also make the parametarized constructor

        //this.name = name ;

        System.out.println("Contructor is called ....");
    }

    // parameterized constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.rollno = rollno;
    }


    void setName(String name){
        this.name = name;
    }
}