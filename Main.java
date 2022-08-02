import java.util.Arrays;

class Main{
    public static void main(String[] args) {

        String[] parts = {"dire", "tide"};

        Car[] myCars = new Car[]{
            new Car("Nissan", 20000.5, 2014, "Blue", parts),
            new Car("Dodge", 20000.5, 2014, "Blue", parts),
            new Car("Opel", 20000.5, 2014, "Blue", parts),
        };

        Dealership dealership = new Dealership();

        for (int i = 0; i < myCars.length; i++) {
            dealership.setCar(myCars[i], i);
        }

        Dealership dealership2 = new Dealership(dealership);
        System.out.println(dealership2);

        System.exit(0);


        dealership.sellCar(1);

        System.out.println("Cars left:\n");
        int notNullCounter = 0;
        for (int i = 0; i < dealership.getAllCars().length; i++) {
            try {
                if (!dealership.getAllCars()[i].equals(null)){
                    System.out.println(dealership.getAllCars()[i]);
                    notNullCounter++;
                }
            } catch (Exception e) {
                continue;
            }
            
        }
        System.out.println(notNullCounter + " Cars left.");

        System.out.println(dealership.searchCar("Nissan", 21000));



        // System.out.println("Get all cars");
        // System.out.println(Arrays.toString(dealership.getAllCars()));



    }
}