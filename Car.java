import java.util.Arrays;

public class Car {
    private String make;
    private double price; 
    private int year; 
    private String color; 
    private String[] parts; 



    // Constructor
    public Car(String make, double price, int year, String color, String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
        // this.parts = new String[3];
    }

    // ---------------- GET & SET ---------------- 
    // GET
    public String getMake(){
        return this.make;
    }
    public double getPrice(){
        return this.price;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }
    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    // SET
    public void setMake(String make){
        this.make = make;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // Copy Constructor
    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length); 
    }

    public void Drive(){
        System.out.println("You bought a car and you drive away with it.");
    }
    

    // toString method - describes obejct when created
    public String toString(){
        return  "\nInitial Description: \n------------------\nMake: " + this.make +
                "\nPrice: " + this.price +
                "\nYear: " + this.year +
                "\nColor: " + this.color +
                "\nParts: " + Arrays.toString(Arrays.copyOf(this.parts, this.parts.length)) + ".\n";
    }
}
