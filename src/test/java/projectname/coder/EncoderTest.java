package projectname.coder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    Encoder encoder = new Encoder();

    @Test
    void testEncode_B() {

        String plainText = "BHELLO WORLD";
        String encodedMsg = encoder.encode(plainText);
        System.out.println(encodedMsg);

        String expectedResult = "BGDKKN VNQKC";
        assertEquals(expectedResult, encodedMsg);
    }

    @Test
    void testEncode_F() {
        String plainText = "FHELLO WORLD";
        String encodedMsg = encoder.encode(plainText);
        System.out.println(encodedMsg);

        String expectedResult = "FC/GGJ RJMG.";
        assertEquals(expectedResult, encodedMsg);
    }

    @Test
    void testEncode_any() {
        String plainText = "a ~HELLO WORLD";
        String encodedMsg = encoder.encode(plainText);
        System.out.println(encodedMsg);

        String expectedResult = "a ~HELLO WORLD";
        assertEquals(expectedResult, encodedMsg);
    }
}