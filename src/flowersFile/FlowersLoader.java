package flowersFile;

import flowers.Chamomile;
import flowers.Rose;
import flowers.Tulip;
import flowersStore.Bouquet;
import java.io.BufferedReader;
import java.io.FileReader;

public abstract class FlowersLoader {
    public static Bouquet load(String path){
        Bouquet bouquet = new Bouquet();
        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (line.contains("Rose")) bouquet.getBouquet().add(new Rose());
                if (line.contains("Chamomile")) bouquet.getBouquet().add(new Chamomile());
                if (line.contains("Tulip")) bouquet.getBouquet().add(new Tulip());
            }
            return bouquet;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bouquet;
    }
}
