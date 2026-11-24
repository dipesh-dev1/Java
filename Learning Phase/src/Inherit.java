class Dipesh {
    void my(){
        System.out.println("Hello");
    }
}
class Devi extends Dipesh{
    void mine(){
        System.out.println("Hii");
    }
}
class Inherit{
public static void main(String[] args) {
    Devi dd=new Devi();
    dd.my();
    dd.mine();
}
}
