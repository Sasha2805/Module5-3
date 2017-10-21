package flowersFile;

import flowers.Chamomile;
import flowers.Rose;
import flowers.Tulip;
import flowersStore.Bouquet;
import java.io.FileWriter;

public abstract class FlowersSaver {
    private static final String SEPARATOR = ";";

    public static void save(String path, Bouquet bouquet){
        try {
            FileWriter writer = new FileWriter(path);
            for (int i = 0; i < bouquet.getBouquet().size(); i++){
                if (bouquet.getBouquet().get(i) instanceof Rose) {
                    writer.write("Rose" + SEPARATOR);
                }
                if (bouquet.getBouquet().get(i) instanceof Chamomile) {
                    writer.write("Chamomile" + SEPARATOR);
                }
                if (bouquet.getBouquet().get(i) instanceof Tulip) {
                    writer.write("Tulip" + SEPARATOR);
                }
                writer.write(bouquet.getBouquet().get(i).getPrice() + SEPARATOR);
                writer.write("\n");
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
