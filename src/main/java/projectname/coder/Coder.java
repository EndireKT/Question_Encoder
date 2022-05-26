package projectname.coder;

public class Coder {
    private char offsetChar;
    private int offsetNum;

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

    public void calcualteOffSetNum() {
        offsetNum = 'A' - offsetChar;
    }
}
