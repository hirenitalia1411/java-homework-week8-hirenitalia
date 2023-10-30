package p_23_methodoverriding;

//creating a child class
class Bike2 extends Vehicle {
    public void run(){
        //defining the same method as in the parent class
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2(); // creating object
        obj.run(); // calling method
    }
}
