package OOPS.Inheritance;

public class hybrid_inheritance {
    public static void main(String[] args) {
        System.out.println("\n Tuna..");
        Tuna t = new Tuna();
        t.eat();
        t.fins = 2;
        System.out.println(t.fins);
        t.swim();
        t.operculum();

        System.out.println("\n Shark ..");
        Shark s = new Shark();
        s.fins = 4;
        System.out.println(s.fins);
        s.swim();
        s.slits();
        s.eat();
        
        System.out.println("\n Peacock ..");
        Peacock p = new Peacock();
        p.beakSize = 10;
        p.breathe();
        p.fly();
        p.feathers();
        p.eat();

        System.out.println("\n Dog..");
        Dog d = new Dog();
        d.legs = 4;
        System.out.println(d.legs);
        d.walk();
        d.eat();
        d.smell();
        d.breathe();

        System.out.println("\n Cat ..");
        Cat c = new Cat();
        c.legs = 4;
        System.out.println(c.legs);
        c.breathe();
        c.flexibleBody();

        System.out.println("\n Human .. ");
        Human h = new Human();
        h.legs = 2;
        System.out.println(h.legs);
        h.eat();
        h.walk();
        h.breathe();
        h.mind();
    }
}

class Animal{
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
        System.out.println("swim");
    }
}

class Tuna extends Fish{
    void operculum(){
        System.out.println("operculum");
    }
}

class Shark extends Fish{
    void slits(){
        System.out.println("slits");
    }
}

class Bird extends Animal{
    int beakSize; 

    void fly(){
        System.out.println("fly");
    }
}

class Peacock extends Bird{
    void feathers(){
        System.out.println("colorful feathers");
    }
}

class Mammal extends Animal{
    int legs;

    void walk(){
        System.out.println("walk");
    }
}

class Dog extends Mammal{
    void smell(){
        System.out.println("have great power to smell");
    }
}

class Cat extends Mammal{
    void flexibleBody(){
        System.out.println("Have flexible body");
    }
}

class Human extends Mammal{
    void mind(){
        System.out.println("Humans are Intelligent Mammals");
    }
}