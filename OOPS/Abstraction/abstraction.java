package OOPS.Abstraction;
public class abstraction{
    public static void main(String[] args) {
        //Animal a = new Animal(); -> gives error
        // Horse h = new Horse();
        // h.changeColor();
        // System.out.println(h.color);
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // System.out.println(c.color);
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang

    }
}

abstract class Animal{
    String color;
    Animal(){
       // color = "brown";// to initialize for it sub classes
        System.out.println("Animal constructor is called .. ");
    } 
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called .. ");
    }
    void changeColor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called .. ");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }

    void walk(){
        System.out.println("walk on 2 legs");
    }
}