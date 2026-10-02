package exercise.basic.q2;

public class Car {

    private String model;
    private int price;

    public Car() {
        this.model = "기본모델";
        this.price = 1000;
    }

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
