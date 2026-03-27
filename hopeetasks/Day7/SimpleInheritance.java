class Parent {
    int x = 10;
    
    void display() {
        System.out.println("I am inside parent class but called by child class");
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("I am inside child class and the value got from parent class x is "+ x);
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Inside Main Function");
        Parent p = new Child();
        p.display();
    }
}