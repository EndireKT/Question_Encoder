package projectname.coder;

public class Decoder extends Coder {
    public Decoder() {

    }

    public String decode(String encodedText) {
        setOffsetChar(encodedText.charAt(0));

        if (offsetNum == -1) {
            return encodedText;
        }

        char[] decodedMsg = encodedText.toCharArray();

        for (int i = 0; i < encodedText.length(); i++) {

            int indexAfterOffset = calcualteIndex(encodedText.charAt(i));

            if (indexAfterOffset == -1) {
                continue;
            }

            int indexBeforeOffset = indexAfterOffset + offsetNum;
            while (indexBeforeOffset > 43) {
                indexBeforeOffset -= 44;
            }
            char c = retrieveShiftedChar(indexBeforeOffset);
            decodedMsg[i] = c;
        }
        decodedMsg[0] = offsetChar;

        return String.valueOf(decodedMsg);
    }
}
