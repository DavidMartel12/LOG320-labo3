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
        while ((line = br.readLine()) != null) {//TODO: split pour les caractères non alphanumérique
            String[] words = line.split("[^\\w']+");
            for (int i = 0; i < words.length; i++) {
                if (frequenceTable.containsKey(words[i]))
                    frequenceTable.put(words[i], frequenceTable.get(words[i]) + 1);
                else
                    frequenceTable.put(words[i], 1);
            }
        }

        return frequenceTable;
    }
}
