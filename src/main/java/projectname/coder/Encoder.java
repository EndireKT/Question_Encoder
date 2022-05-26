package projectname.coder;

public class Encoder extends Coder {

    public Encoder(char offsetChar) {
        super(offsetChar);
    }

    public String encode(String plainText) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            //sb.setCharAt(i, plainText.charAt(i) + offsetNum);
        }

        return "test";
    }
}
