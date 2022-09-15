package test;

import controller.NumberController;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberControllerTest {
    @Test
    public void isDivisibleBy2Test() {
        assertEquals(true, NumberController.isDivisibleBy2(2.0));
        assertEquals(false, NumberController.isDivisibleBy2(3.0));
    }

}