package flowersStore;

import flowers.Chamomile;
import flowers.Rose;
import flowers.Tulip;
import java.util.Arrays;

public class FlowerStore {
    private double purse;
    private double priceRose = new Rose().getPrice();
    private double priceChamomile = new Chamomile().getPrice();
    private double priceTulip = new Tulip().getPrice();

    public FlowerStore() {
        purse = 0;
    }

    public Bouquet sell(int countRoses, int countChamomiles, int countTulips){
        Bouquet bouquet = new Bouquet();
        for (int i = 0; i < countRoses; i++) bouquet.getBouquet().add(new Rose());
        for (int i = 0; i < countChamomiles; i++) bouquet.getBouquet().add(new Chamomile());
        for (int i = 0; i < countTulips; i++) bouquet.getBouquet().add(new Tulip());
        purse += (priceRose * countRoses) + (priceChamomile * countChamomiles) + (priceTulip * countTulips);
        return bouquet;
    }

    public Bouquet sellSequence(int countRoses, int countChamomiles, int countTulips){
        Integer[] countFlowers = new Integer[]{countRoses, countChamomiles, countTulips};
        Arrays.sort(countFlowers);
        Bouquet bouquet = new Bouquet();
        for (int i = 1; i <= countFlowers[countFlowers.length - 1]; i++){
            if (i <= countRoses) bouquet.getBouquet().add(new Rose());
            if (i <= countChamomiles) bouquet.getBouquet().add(new Chamomile());
            if (i <= countTulips) bouquet.getBouquet().add(new Tulip());
        }
        purse += (priceRose * countRoses) + (priceChamomile * countChamomiles) + (priceTulip * countTulips);
        return bouquet;
    }

    public double getPurse() {
        return purse;
    }
}
