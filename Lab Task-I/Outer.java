public class Outer {
    class Inner{
        void display(){
            System.out.println("This is inner class method.");
        }
    }
    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.Inner in=out.new Inner();
        in.display();
    }
}
