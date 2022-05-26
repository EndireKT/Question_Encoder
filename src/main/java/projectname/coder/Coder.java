package projectname.coder;

import projectname.ui.Message;

public class Coder {
    protected int offsetNum;
    protected char offsetChar;

    public Coder() {
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
        offsetNum = calcualteIndex(offsetChar);
        if (offsetNum == -1) {
            Message.msgInvalidOffsetChar();
        }
    }

    protected int calcualteIndex(char c) {
        if (65 <= c && c <= 90) {
            return c - 'A';
        } else if (48 <= c && c <= 57) {
            return c - '0' + 26;
        } else if (40 <= c && c <= 47) {
            return c - '(' + 36;
        } else {
            return -1;
        }
    }

    protected char retrieveShiftedChar(int index) {
        if (0 <= index && index <= 25) {
            return (char) ('A' + index);
        } else if (26 <= index && index <= 35) {
            return (char) ('0' + index - 26);
        } else if (36 <= index && index <= 43) {
            return (char) ('(' + index - 36);
        } else {
            return (char) index;
        }
    }
}
