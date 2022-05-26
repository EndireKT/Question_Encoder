package projectname;

import projectname.coder.Encoder;

public class Main {

    public String decode(String encodedText) {
        return null;
    }

    public static void main(String[] args) {
        String plainText = "HelloWord";
        Encoder encoder = new Encoder();

        String encodedMsg = encoder.encode(plainText);
        System.out.println(encodedMsg);
    }
}
