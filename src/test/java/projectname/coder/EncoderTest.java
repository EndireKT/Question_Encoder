package projectname.coder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    Encoder encoder = new Encoder('A');


    @Test
    void testEncode() {
        String plainText = "HELLO WORLD";
        String encodedMsg = encoder.encode(plainText);
        System.out.println(encodedMsg);

        String expectedResult = "BGDKKN VNQKC";
        assertEquals(expectedResult, encodedMsg);
    }
}