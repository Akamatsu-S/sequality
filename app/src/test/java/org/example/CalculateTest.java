package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate classUnderTest = new Calculate();
    int expected = 5; /* 5から6に書き換える */
    assertEquals(expected, classUnderTest.sum(2, 3));
  }

}
