package flowers;

public class Flowers {
    private double price;

    public Flowers() {
        this.price = 0;
        if (this instanceof Rose) this.price = 100;
        if (this instanceof Chamomile) this.price = 70;
        if (this instanceof Tulip) this.price = 70;
    }

    // Getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
