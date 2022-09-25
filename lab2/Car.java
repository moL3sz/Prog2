class Vehicle{
    protected String brand = "Toyota";
    public void honk(){
        System.out.println("Tütűűűű");
    }

}



public class Car extends Vehicle {

        private String modelName = "Supra";
        public static void main(String args[]){
            Car c1 = new Car();
            c1.honk();
            System.out.println("brand: " + c1.brand + "\tmodel: " + c1.modelName);

        }
}
