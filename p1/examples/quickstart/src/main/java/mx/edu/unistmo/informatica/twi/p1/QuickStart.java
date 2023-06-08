package mx.edu.unistmo.informatica.twi.p1;

/**
 * Hello world!
 *
 */
public class QuickStart 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int numeroMayor(int a, int b, int c) 
    {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;
        } else {
            return b;
        }
    }
}
