package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double sumave(int x, int y) {
    return (x + y) / 2.0;
  }

  public int sum10() {
    int sum = 0;
    for (int i = 1; i < 11; i++) {
      sum += i;
    }
    return sum;
  }

  public double sum10ave() {
    return sum10() / 10.0;
  }

  public int sumOdd10() {
    int sum = 0;
    for (int i = 1; i < 11; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumEven10() {
    int sum = 0;
    for (int i = 1; i < 11; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
