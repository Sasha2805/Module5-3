import flowers.Flower;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> bouquet;

    public Bouquet() {
        bouquet = new ArrayList<>();
    }

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public void show() {
       for (int i = 0; i < bouquet.size(); i++){
           bouquet.get(i).show();
           if (i != bouquet.size() - 1) System.out.print(", ");
       }
        System.out.println();
    }
}
