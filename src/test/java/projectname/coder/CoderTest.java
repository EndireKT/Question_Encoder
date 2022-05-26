package projectname.coder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoderTest {

    Coder coder;

    @Test
    void testcalcualteOffSetNum() {
        coder = new Coder('A');
        int actualResult = coder.getOffsetNum();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}