package mx.edu.unistmo.informatica.twi.p2.business;

public class CalculadoraBR {
  private int a;
  private int b;

  public CalculadoraBR(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int suma() {
    return a + b;
  }
}
