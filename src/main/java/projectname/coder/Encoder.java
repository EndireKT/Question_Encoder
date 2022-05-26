package projectname.coder;

public class Encoder extends Coder {

    public Encoder() {
    }

    public String encode(String plainText) {
        setOffsetChar(plainText.charAt(0));

        if (offsetNum == -1) {
            return plainText;
        }

        char[] encodedMsg = plainText.toCharArray();

        for (int i = 0; i < plainText.length(); i++) {

            int indexBeforeOffset = calcualteIndex(plainText.charAt(i));

            if (indexBeforeOffset == -1) {
                continue;
            }

            int indexAfterOffset = indexBeforeOffset - offsetNum;
            while (indexAfterOffset < 0) {
                indexAfterOffset += 44;
            }
            char c = retrieveShiftedChar(indexAfterOffset);
            encodedMsg[i] = c;
        }
        encodedMsg[0] = offsetChar;

        return String.valueOf(encodedMsg);
    }
}
