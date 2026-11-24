/*public class Polymorphism {
    int done(int a,int b){
        return a+b;
    }
    int her(int c, int d){
       return c+d;
    }
    public static void main(String[] args) {
        Polymorphism pp = new Polymorphism();
        int sum=pp.done(4,5);
        int sum2=pp.her(10, 13);
        System.out.println("Result is :"+sum);
        System.out.println("SEcond result :"+sum2);
    }
}*/
class Jeri{
    void so(){
        System.out.println("Who");
    }
}
class Tori extends Jeri{
    void art(){
        System.out.println("Hency");
    }
}
public class Polymorphism {
public static void main(String[] args) {
    Tori tt = new Tori();
    tt.so();
    tt.art();
}
}
