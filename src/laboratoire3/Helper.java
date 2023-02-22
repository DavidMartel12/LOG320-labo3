package laboratoire3;

import java.io.*;
import java.util.HashMap;
import java.util.Objects;

public class Helper {

    public HashMap<String, Integer> createFrequencyTable(File fichier) throws IOException {

        HashMap<String, Integer> frequenceTable = new HashMap<>();
        FileReader fl = new FileReader(fichier);
        BufferedReader br = new BufferedReader(fl);
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("[^\\p{L}\\p{N}\\p{M}]");
            for (int i = 0; i < words.length; i++) {
                String motMinuscule = words[i].toLowerCase();
                if (frequenceTable.containsKey(motMinuscule)) {
                    frequenceTable.put(motMinuscule, frequenceTable.get(motMinuscule) + 1);
                }
                else
                    frequenceTable.put(motMinuscule, 1);
            }
        }
        return frequenceTable;
    }

    public int scalarProduct(HashMap<String, Integer> table1, HashMap<String, Integer> table2) {
        int produitScalaire = 0;
        for (String key : table1.keySet()) {
            if (table2.containsKey(key)) {
                produitScalaire += table1.get(key) * table2.get(key);
            }
        }
        return produitScalaire;
    }

    public double norm(HashMap<String, Integer> table) {
        double norme = 0;
        for (String key : table.keySet()) {
            norme += Math.pow(table.get(key), 2);
        }
        return Math.sqrt(norme);
    }
}
