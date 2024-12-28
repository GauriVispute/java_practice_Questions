package OOPS.Inheritance;

public class single_level_inheritance {
    public static void main(String[] args) {
        Fish shark = new  Fish();
        shark.eat();
    }
}

//Base Class
class Animal{
    String skinColor ;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }    
}

// Derived class / subclass
class Fish extends Animal{
    int fins ;

    void swim(){
        System.out.println("swims in water");
    }
}
