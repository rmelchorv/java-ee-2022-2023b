package mx.edu.unistmo.informatica.twi.p2.controllers.control;

public class Calculadora {
  private int a;
  private int b;

  public Calculadora(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int suma() {
    return a + b;
  }
}
