import flowersFile.FlowersLoader;
import flowersFile.FlowersSaver;
import flowersStore.FlowerStore;

public class Main {
    private static final String PATH = "src/flowersFile/flowers_data.txt";

    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        flowerStore.sell(2, 3, 4).show();
        flowerStore.sellSequence(5, 3, 1).show();
        System.out.println(flowerStore.getPurse());

        FlowersSaver.save(PATH, flowerStore.sell(2, 2, 2));
        if (FlowersLoader.load(PATH) != null) FlowersLoader.load(PATH).show();
    }
}
