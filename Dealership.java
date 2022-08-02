import java.util.Arrays;

public class Dealership {
    private Car[] cars;


    // Constructor
    public Dealership(){
        this.cars = new Car[3];
    }

    // GET
    public Car getCar(int index){
        // deduct one from the idnex to match "i" in for loop
        index--;
        for (int i = 0; i < cars.length; i++) {
            if (index == i){
                Car copyNewCar = new Car(this.cars[i]);
                return copyNewCar;
            }
        }
        // Return first value if not found by index
        return this.cars[0];
    }

    public Car[] getAllCars(){
        return Arrays.copyOf(this.cars, this.cars.length);
    }

    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }

    public void sellCar(int index){
        index--;
        for (int i = 0; i < cars.length; i++) {
            if (i == index){
                System.out.println("You sold a " + cars[i].getMake());
                cars[i].Drive();
            }
        }
        this.cars[index] = null;
    }

    public String searchCar(String make, double price){
        System.out.println("IN method");
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null){
                continue;
            }
            if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= price){
                return "We found a car for you!:\n" + this.cars[i];
            }
            else{
                return "Sorry, there is no such car.";
            }
        }
        
        return "Sorry, there is no such car.";
    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            System.out.println("Current car: " + this.cars[i]);
            if (this.cars[i] == null){
                continue;
            }
            temp += "\nParking spot: " + i + "\n";
            temp += this.cars[i].toString() + "\n";
        }
        return temp;
    }

    // Copy Const.
    public Dealership(Dealership source){
        this.cars = Arrays.copyOf(source.cars, source.cars.length);
    }
}
