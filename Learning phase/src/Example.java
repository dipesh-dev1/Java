class Sir{
    void show(){

        System.out.println("Hello Sir");
    }
}
class Teacher extends Sir{
    void show(){
        System.out.println("Hello Teacher");
    }
}
public class Example {
    public static void main(String[] args) {
       Sir t = new Teacher();
        t.show();
    }
    }
