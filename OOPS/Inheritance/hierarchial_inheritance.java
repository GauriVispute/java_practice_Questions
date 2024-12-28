package OOPS.Inheritance;

public class hierarchial_inheritance {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();
        tuna.swim();

        Bird parrat =  new Bird();
        parrat.color = "Green";
        System.out.println(parrat.color);
        parrat.fly();

        Mammal human = new Mammal();
        human.eat();
        human.breathe();
        human.walk();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

class Bird extends Animal{
    
    void fly(){
        System.out.println("fly in sky");
    }
}

class Mammal extends Animal{

    void walk(){
        System.out.println("walks on ground");
    }
}