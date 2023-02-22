package laboratoire3;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.lang.Math;

public class DocDist {

    // Ne pas changer cette fonction, elle sera utilisée pour tester votre programme
    public double docDistance(String nomFichier1, String nomFichier2) {

        double radian = 0;

        try {
            Helper helper = new Helper();
            HashMap<String, Integer> tableFichier1 = helper.createFrequencyTable(new File(nomFichier1));
            HashMap<String, Integer> tableFichier2 = helper.createFrequencyTable(new File(nomFichier2));

            double produitScalaire = helper.scalarProduct(tableFichier1, tableFichier2);
            double norme1 = helper.norm(tableFichier1);
            double norme2 = helper.norm(tableFichier2);
            radian = Math.acos(produitScalaire / (norme1 * norme2));
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
            throw new RuntimeException(e);
        }

        return radian;
    }


}