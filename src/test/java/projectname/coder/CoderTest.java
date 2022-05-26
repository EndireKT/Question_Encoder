package projectname.coder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoderTest {

    Coder coder = new Coder();

    @Test
    void testcalcualteOffSetNum_A() {
        coder.setOffsetChar('A');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_Z() {
        coder.setOffsetChar('Z');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 25;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_0() {
        coder.setOffsetChar('0');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 26;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_symbol1() {
        coder.setOffsetChar('(');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 36;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_symbol2() {
        coder.setOffsetChar('+');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 39;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_notInList() {
        coder.setOffsetChar('<');
        int actualResult = coder.getOffsetNum();
        int expectedResult = -1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void retrieveCodedChar_A() {
        char actualResult = coder.retrieveShiftedChar(0);
        char expectedResult = 'A';
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void retrieveCodedChar_Z() {
        char actualResult = coder.retrieveShiftedChar(25);
        char expectedResult = 'Z';
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void retrieveCodedChar_0() {
        char actualResult = coder.retrieveShiftedChar(26);
        char expectedResult = '0';
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void retrieveCodedChar_9() {
        char actualResult = coder.retrieveShiftedChar(35);
        char expectedResult = '9';
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void retrieveCodedChar_symbol1() {
        char actualResult = coder.retrieveShiftedChar(36);
        char expectedResult = '(';
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void retrieveCodedChar_symbol2() {
        char actualResult = coder.retrieveShiftedChar(43);
        char expectedResult = '/';
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void retrieveCodedChar_notInList() {
        char actualResult = coder.retrieveShiftedChar(100);
        char expectedResult = 'd';
        assertEquals(expectedResult, actualResult);
    }
}