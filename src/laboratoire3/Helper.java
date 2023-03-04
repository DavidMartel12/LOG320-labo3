package laboratoire3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Helper {

        public HashMap<String, Integer> createFrequencyTable(File fichier) throws IOException {

        HashMap<String, Integer> frequenceTable = new HashMap<>();
        FileReader fl = new FileReader(fichier);
        BufferedReader br = new BufferedReader(fl);
        String line;
        while ((line = br.readLine()) != null) {
            var words = separateWordFromString(line);

            for (var word : words) {
                String motMinuscule = word.toLowerCase();
                if (frequenceTable.containsKey(motMinuscule)) {
                    frequenceTable.put(motMinuscule, frequenceTable.get(motMinuscule) + 1);
                } else
                    frequenceTable.put(motMinuscule, 1);
            }
        }
        frequenceTable.remove("");
        return frequenceTable;
    }
    private List<String> separateWordFromString(String line) {
        List<String> words = new ArrayList<>();
        int start = -1;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start != -1) {
                    words.add(line.substring(start, i));
                    start = -1;
                }
            }
        }
        if (start != -1) {
            words.add(line.substring(start));
        }
        return words;
    }
    public double scalarProduct(HashMap<String, Integer> table1, HashMap<String, Integer> table2) {
        double produitScalaire = 0;
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
