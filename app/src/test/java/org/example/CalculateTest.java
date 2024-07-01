package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  // public void testSum() {
  // Calculate classUnderTest = new Calculate();
  // int expected = 5; /* 5から6に書き換える */
  // assertEquals(expected, classUnderTest.sum(2, 3));
  // }

  @Test
  public void testSum() {
    Calculate classUnderTest = new Calculate();
    int expected = 5; /* 5から6に書き換える */
    assertEquals(expected, classUnderTest.sum(2, 3));
  }

  @Test
  public void testSumave() {
    Calculate classUnderTest = new Calculate();
    double expected = 2.5;
    assertEquals(expected, classUnderTest.sumave(2, 3), 0.0001);
  }

  @Test
  public void testSum10() {
    Calculate classUnderTest = new Calculate();
    int expected = 55; /* 5から6に書き換える */
    assertEquals(expected, classUnderTest.sum10());
  }

  @Test
  public void testSum10ave() {
    Calculate classUnderTest = new Calculate();
    double expected = 5.5;
    assertEquals(expected, classUnderTest.sum10ave(), 0.0001);
  }

  @Test
  public void testSumOdd10() {
    Calculate classUnderTest = new Calculate();
    int expected = 25;
    assertEquals(expected, classUnderTest.sumOdd10());
  }

  @Test
  public void testSumEven10() {
    Calculate classUnderTest = new Calculate();
    int expected = 30;
    assertEquals(expected, classUnderTest.sumEven10());
  }
}
