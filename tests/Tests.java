import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {


    @Test
    public void Frame() {
        Frame frame = new Frame();
        frame.setThrow(2);
        frame.setThrow(4);

        int throwOne = frame.getThrowOne();
        int throwTwo = frame.getThrowTwo();

        assertEquals(2, throwOne);
        assertEquals(4, throwTwo);
    }


}