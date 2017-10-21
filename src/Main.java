import flowersStore.FlowerStore;

public class Main {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        flowerStore.sell(1,1,1).show();
        flowerStore.sellSequence(1, 1, 1).show();
        System.out.println(flowerStore.getPurse());
    }

}
