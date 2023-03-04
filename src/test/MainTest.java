package test;

import laboratoire3.Helper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Helper helper;

    @BeforeEach
    void setUp() {
        helper = new Helper();
    }

    @Test
    @DisplayName("test whether separateStringFromString ")
    void testSeparateStringIntoWordWithAccent() {
        var words = helper.separateWordFromString("Café'au@lait and crème brûlée are delicious!");
        var expect = new ArrayList<String>();
        expect.add("Café");
        expect.add("au");
        expect.add("lait");
        expect.add("and");
        expect.add("crème");
        expect.add("brûlée");
        expect.add("are");
        expect.add("delicious");
        for (var i = 0; i < words.size(); i++) {
            System.out.println(words.get(i) + " = " + expect.get(i));
            assert words.get(i).equals(expect.get(i));
        }
    }

}
