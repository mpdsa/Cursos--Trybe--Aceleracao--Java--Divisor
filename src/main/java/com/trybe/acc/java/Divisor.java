package com.trybe.acc.java;

import java.lang.ArithmeticException;

/** Classe divisor. */
public class Divisor {

  /** Método dividir. */
  public int dividir(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      return 0;
    }
  }
}
