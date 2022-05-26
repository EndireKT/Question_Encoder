package projectname;

import projectname.coder.Decoder;
import projectname.coder.Encoder;

public class Main {

    public static void main(String[] args) {
        String plainText = "FHELLO WORLD abc~!@";
        Encoder encoder = new Encoder();

        String encodedMsg = encoder.encode(plainText);
        System.out.println(encodedMsg);

        Decoder decoder = new Decoder();
        String decodedMsg = decoder.decode(encodedMsg);
        System.out.println(decodedMsg);
    }
}
