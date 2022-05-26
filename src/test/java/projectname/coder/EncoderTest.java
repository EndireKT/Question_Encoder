package projectname.coder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    Encoder encoder = new Encoder("A");
    String plainText = "HelloWord";

    @Test
    void testEncode() {
        String encodedMsg = encoder.encode(plainText);
        System.out.println(encodedMsg);
    }
}