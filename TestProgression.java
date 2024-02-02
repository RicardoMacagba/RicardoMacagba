import java.text.ParseException;
import java.util.jar.JarException;

class TestProgression {
    public static void main(String[] args) throws Exception, IllegalAccessError, JarException, ParseException {

        Progression prog;
        //arithmetic progression
        System.out.println("Arithmetic Progression with default increment: ");
        prog = new ArithProgression();
        prog.printProgression(10);
        System.out.println("Arithmetic Progression with increment 5: ");
        prog = new ArithProgression(5);
        prog.printProgression(10);
        //geometric progression
        System.out.println("geometric progression with default base: ");
        prog = new GeometricProgression();
        prog.printProgression(10);
        System.out.println("geometric progression with base 3: ");
        prog = new GeometricProgression(3);
        prog.printProgression(10);
        //fibonacci progression
        System.out.println("fibonacci progression with default start values: ");
        prog = new FibonacciProgression();
        prog.printProgression(10);
        System.out.println("fibonacci progression the start values 4 and 6: ");
        prog = new FibonacciProgression(4,6);
        prog.printProgression(10);
    }
}
