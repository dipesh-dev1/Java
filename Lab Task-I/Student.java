public class Student {
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name of student "+ name );
        System.out.println("Age is "+age);
    }
    public static void main(String[] args) {
        Student s=new Student("Dipesh Chaudhary", 19);
        s.display();
    }
}
