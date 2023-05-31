package jsp.ejemplo;

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
