package OOPS;

public class getters_setters {
    public static void main(String [] args){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color ;
    private int tip;

    //use getter and setter

    /*
     * these fuctions are mainly used for 
     * accessing the private datatype
     * 
     * Get : to reture the value
     * 
     * Set : to modify the value
     * 
     * this : 'this' keyword is used refer the current object
     * 
     */

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
    this.tip = tip;
    }

    
}
