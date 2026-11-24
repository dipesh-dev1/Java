/*public class Encapsulation {
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Encapsulation ee= new Encapsulation();
        ee.setName("Dipesh");
        System.out.println(ee.getName());
    }
}*/
public class Encapsulation {
    private String name;
    public void setName(String name){
        this.name=name;

    }
    public String getName(){

        return name;

    }
    public static void main(String[] args) {
        Encapsulation e= new Encapsulation();
        e.setName("Dipesh");
        System.out.println(e.getName());
    }
}