package OOPS;

public  class class_object{
    public static void main(String[] args) {
        
        // new memory
        Pen p1 = new Pen();  // creating a object pen called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
        
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}


class student{
    String name ;
    int age;
    float percentage ;

    void calcPercentage(int phy ,int chem,int math){
        percentage  = (phy+chem+math)/3;
    }
}