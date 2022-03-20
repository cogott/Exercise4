public class Car {
    private String model;
    private String brand;
    private String colour;
    private int year;
    private int price;
    private int quantity;

    public Car(String model,String brand,String colour, int year, int price,int quantity ){
        this.model = model;
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.price = price;
        this.quantity= quantity;
    }

    public void delivery(int n) {quantity += n;}
    public void sell(int n){quantity += n;}


    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public String getColour() {return colour;}

    public void setColour(String colour) {this.colour = colour;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}



    @Override
    public String toString(){
        return "Car{" +
                "model =" + model + '\''+
                "brand =" + brand + '\''+
                "colour =" + colour +
                "year =" + year +
                "price =" + price +
                "quantity =" + quantity +
                '}';

    }

    public class CarDemo{
        public static void main(String[] args) {
            Car car1 = new Car("GLE","Mercedes","white",2020,3500000,5);
            System.out.println(car1.toString());
            car1.sell(2);
            System.out.println(car1.getColour());
            car1.setColour("black");
            System.out.println(car1.toString());
        }
    }
}


