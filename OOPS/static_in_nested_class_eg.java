package OOPS;

public class static_in_nested_class_eg {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = "JVM";

        Student s2 = new Student();
        System.out.println(s2.SchoolName);

        Student s3 = new Student();
        s3.SchoolName = "ABC";
        //System.out.println(s3.SchoolName);

    }
}

class Student{
    String name ;
    int roll;

    static String SchoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void setRoll(int roll){
        this.roll = roll;
    } 

    int getRoll(){
        return this.roll;
    }
} 