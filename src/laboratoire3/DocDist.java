package laboratoire3;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class DocDist{

    // Ne pas changer cette fonction, elle sera utilisée pour tester votre programme
    public double docDistance(String nomFichier1, String nomFichier2) throws IOException {

        Helper helper = new Helper();

        HashMap<String, Integer> tableFichier1 = helper.createFrequencyTable(new File(nomFichier1));
        HashMap<String, Integer> tableFichier2 = helper.createFrequencyTable(new File(nomFichier2));

        return 0.0; //Équation
    }

}