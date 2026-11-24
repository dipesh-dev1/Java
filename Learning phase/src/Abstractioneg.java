abstract class Don{
    abstract void show();
}
class Khalnayak extends Don{
    void show(){
        System.out.println("Kya halchal vaiya!!");
    }
}
public class Abstractioneg {
    public static void main(String[] args) {
        Don d = new Khalnayak();
        d.show();
    }
}
