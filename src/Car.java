public class Car {
    private String Model;
    private String Brand;
    private int Year;
    private int Price;
    private String Color;
    private int Quantity;

    public Car(String model, String brand, int year, int price, String color, int quantity) {
        Model = model;
        Brand = brand;
        Year = year;
        Price = price;
        Color = color;
        Quantity = quantity;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Brand='" + Brand + '\'' +
                ", Year=" + Year +
                ", Price=" + Price +
                ", Color='" + Color + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
    public void delivery(int quantity) {
        this.Quantity += quantity;
        System.out.println(quantity + " cars are delivered.");
    }
    public void sell(int quantity) {
        if (this.Quantity >= quantity) {
            this.Quantity -= quantity;
            System.out.println(quantity + " cars are sold.");
        } else {
            System.out.println("There are not enpugh cars in stock .");
        }
    }


}



