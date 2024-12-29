package OOPS.Abstraction;

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.breathe();
    }
}

interface Herbiverous{
    void eat();
}

interface Carnivorous{
    void breathe();
}

class Bear implements Herbiverous,Carnivorous{
    public void eat(){
        System.out.println("Deer eats only grass");
    }

    public void breathe(){
        System.out.println("breathes");
    } 
}
