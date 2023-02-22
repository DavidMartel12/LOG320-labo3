import laboratoire3.DocDist;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var doc = new DocDist();
        doc.docDistance( ".\\src\\fables_Lafontaine.txt",".\\src\\l_avare-Moliere.txt");    }
}