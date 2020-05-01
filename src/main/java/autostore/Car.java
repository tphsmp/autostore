package autostore;

public abstract class Car {

    protected String model;
    protected int price;
    protected int hight;
    protected int width;
    protected int length;

    public Car(String model, int price, int hight, int width, int length) {
        this.model = model;
        this.price = price;
        this.hight = hight;
        this.width = width;
        this.length = length;
        //this.status = status;
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

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", hight=" + hight +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

