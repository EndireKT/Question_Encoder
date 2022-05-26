package projectname.coder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoderTest {

    Decoder decoder = new Decoder();

    @Test
    void testDecode_B() {
        String encodedMsg = "BGDKKN";
        String plainText = decoder.decode(encodedMsg);
        System.out.println(plainText);

        String expectedResult = "BHELLO";
        assertEquals(expectedResult, plainText);
    }

    @Test
    void testDecode_F() {
        String encodedMsg = "FC/GGJ";
        String plainText = decoder.decode(encodedMsg);
        System.out.println(plainText);

        String expectedResult = "FHELLO";
        assertEquals(expectedResult, plainText);
    }

    @Test
    void testEncode_any() {
        String encodedMsg = "-B C~";
        String plainText = decoder.decode(encodedMsg);
        System.out.println(plainText);

        String expectedResult = "-. /~";
        assertEquals(expectedResult, plainText);
    }

    @Test
    void testEncode_notInList() {
        String encodedMsg = "aB C~";
        String plainText = decoder.decode(encodedMsg);
        System.out.println(plainText);

        String expectedResult = "aB C~";
        assertEquals(expectedResult, plainText);
    }
}