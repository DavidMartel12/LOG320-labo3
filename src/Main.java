import laboratoire3.DocDist;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var doc = new DocDist();
        doc.docDistance(".\\src\\monte_cristo_1-Dumas.txt", ".\\src\\monte_cristo_2-Dumas.txt");    }
}