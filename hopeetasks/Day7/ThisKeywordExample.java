class Student{
    String name;
    String rollno;
    String dept;
    Student(String name, String rollno){
        this.name = name;
        this.rollno = rollno;
    }
    Student(String name, String rollno, String dept){
        this.name = name;
        this.rollno = rollno;
        this.dept = dept;
    }
    void display(){
        System.out.println("Name: "+ this.name +"\nRoll Number: "+ this.rollno);
    }
}
public class ThisKeywordExample {
    public static void main(String[] args) {
        Student s1 = new Student("Prasanth K S", "171CS222");
        s1.display();
        System.out.println(s1.hashCode());
        Student s2 = new Student("Prasanth K S", "171CS222", "CSE");
        s2.display();
        System.out.println(s2.hashCode());
        Student s3 = new Student("Prasanth K S", "171CS222");
        s3.display();
        System.out.println(s3.hashCode());
    }
}
