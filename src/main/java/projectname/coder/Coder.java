package projectname.coder;

public class Coder {
    protected int offsetNum;
    private char offsetChar;

    public Coder(char offsetChar) {
        this.offsetChar = offsetChar;
        calcualteOffSetNum();
    }

    public void setOffsetChar(char newChar) {
        offsetChar = newChar;
        calcualteOffSetNum();
    }

    public char getOffsetChar() {
        return offsetChar;
    }

    public int getOffsetNum() {
        return offsetNum;
    }

    private void calcualteOffSetNum() {
        if (65 <= offsetChar && offsetChar <= 90) {
            offsetNum = offsetChar - 'A';
        } else if (48 <= offsetChar && offsetChar <= 57) {
            offsetNum = offsetChar - '0' + 26;
        } else if (40 <= offsetChar && offsetChar <= 47) {
            offsetNum = offsetChar - '(' + 36;
        } else {
            offsetNum = offsetChar;
        }
    }
}
