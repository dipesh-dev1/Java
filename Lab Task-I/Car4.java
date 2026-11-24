// Stat Count

class Car4 {
    String model;
    static int count = 0;

    Car4(String modelName) {
      this.model = modelName;
      System.out.println(model);
        count++; 
    }

    static int getCount() {
        return count; 
    }
    public static void main(String[] args) {
        Car4 j = new Car4("Toyota");
        Car4 c2 = new Car4("Supra");
        Car4 c3 = new Car4("Ford");

        System.out.println("Total cars: " + getCount());
    }
}