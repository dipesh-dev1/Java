/*abstract class Horami {
    abstract void don();
}
class Sir extends Horami{
    void don(){
        System.out.println("Hello students!");
    }
} 
public class Abstraction{
    public static void main(String[] args) {
        Horami h=new Sir();
        h.don();
    }
}*/

interface Dai{
    void sound();
}
class vai implements Dai{
    public void sound(){
        System.out.println("K garxa,?");
    }
}
public class Abstraction {

    public static void main(String[] args) {
        Dai d=new vai();
        d.sound();
    }
}
