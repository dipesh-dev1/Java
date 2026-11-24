class He {
    private String name;
    private int age;
    private char id;
    private double salary;

//    public void setName(String nam) {
//        name = nam;
//    }
//    public void setAge(int a){
//        age = a;
//    }
//    public void setId(char i){
//        id = i;
//    }
//    public void setSalary(double s){
//        salary = s;
//    }

//    public void setAll(String name, int age, char id, double salary){
//        this.name=name;
//        this.age=age;
//        this.id=id;
//        this.salary=salary;
//    }
        public He(String name, int age, char id, double salary){
            this.name=name;
            this.age=age;
            this.id=id;
            this.salary=salary;
        }
    public String getName() {return name;}
    public int getAge(){return age;}
    public char getId(){return id;}
    public double getSalary(){return salary;}
}
public class Encapsulationeg {
    public static void main(String[] args) {
       He e = new He("Dipesh Chaudhary",19,'D',100000);
  //      e.setAll("Dipesh Chaudhary",19,'D',100000);
//        e.getAge(19);
//        e.getId('D');
//        e.getSalary(100000);
        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
    }
}
