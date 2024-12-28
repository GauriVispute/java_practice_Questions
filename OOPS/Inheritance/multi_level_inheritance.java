package OOPS.Inheritance;

public class multi_level_inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eats();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    int legs ;
}

class Dog extends Mammals{
    String breed;
}