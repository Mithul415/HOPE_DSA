class Animal{
    void display(){
        System.out.println("There are multilevel animals choose many of same hirerachy and mention it's sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void weeps(){
        System.out.println("Puppy whines");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Puppy sound = new Puppy();
        sound.display();
        sound.bark();
        sound.weeps();
    }
}
