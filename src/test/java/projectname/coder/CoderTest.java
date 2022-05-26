package projectname.coder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoderTest {

    Coder coder;

    @Test
    void testcalcualteOffSetNum_A() {
        coder = new Coder('A');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_Z() {
        coder = new Coder('Z');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 25;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_0() {
        coder = new Coder('0');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 26;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_symbol1() {
        coder = new Coder('(');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 36;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_symbol2() {
        coder = new Coder('+');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 39;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testcalcualteOffSetNum_notInList() {
        coder = new Coder('<');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 60;
        assertEquals(expectedResult, actualResult);
    }
}