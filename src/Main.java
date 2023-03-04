import laboratoire3.DocDist;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var doc = new DocDist();

        long startTime = System.currentTimeMillis();
        System.out.println(doc.docDistance(".\\src\\l_avare-Moliere.txt", ".\\src\\fables_Lafontaine.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(doc.docDistance(".\\src\\monte_cristo_1-Dumas.txt", ".\\src\\monte_cristo_2-Dumas.txt"));
        endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(doc.docDistance(".\\src\\return_of_Sherlock_Holmes-Doyle.txt", ".\\src\\adventures_of_Sherlock_Holmes-Doyle.txt"));
        endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(doc.docDistance(".\\src\\monte_cristo_1-Dumas.txt", ".\\src\\mysterious_affair_at_Styles-Christie.txt"));
        endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(doc.docDistance(".\\src\\monte_cristo_1-Dumas.txt", ".\\src\\monte_cristo_1-Dumas.txt"));
        endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));
    }
}