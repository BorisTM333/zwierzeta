interface Animal {
    void sound();
    default void sleep() {
        System.out.println("Zwirzok idzie spać.");
    }
    static void endOfDay() {
        System.out.println("Koniec dnia, zwirzoki idą spać");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("HAŁ HAŁ");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Miał MIAŁ");
    }
}

public class Application {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.sound();
        dog.sleep();
        
        cat.sound();
        cat.sleep();
        
        Animal.endOfDay();
    }
}

