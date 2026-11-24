// This is multiple inheritance

interface Interfaceeg {

    void boy();
}
interface InnerInterfaceeg {
void girl();
    
} 
class InnerInterfaceeg_1 implements Interfaceeg,InnerInterfaceeg {
    public void boy(){
        System.out.println("This is interface boy");
    }
    public void girl(){
        System.out.println("This is interface girl");
    }
}
public class Dipesh{
    public static void main(String[] args) {
        InnerInterfaceeg_1 obj = new InnerInterfaceeg_1();
        obj.boy();
        obj.girl();
    }
}
    

