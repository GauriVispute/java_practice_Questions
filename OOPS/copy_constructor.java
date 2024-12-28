package OOPS;

public class copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gauri";
        s1.rollno = 12;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0;i<(s2.marks).length;i++){
            System.out.println(s2.marks[i]);
        }
    }

}

class Student{
    String name ;
    int rollno;
    String password;
    int marks[];

    
    Student (){
        marks = new int [3];
        //System.out.println("Constructor is called ..");
    }


    // shallow copy constructor
    // Student(Student s1){
    //     marks = new int [3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
        
    //     this.marks = s1.marks;  //-> s1 .marks array reference is passed to marks
    // }

    // deep copy constructor
    Student (Student s1){
        marks =  new int [3];
        
        this .name = s1.name;
        this.rollno = s1.rollno;
        
        for(int i=0;i<marks.length;i++){
            marks[i] = s1.marks[i];
        }

    }
} 
