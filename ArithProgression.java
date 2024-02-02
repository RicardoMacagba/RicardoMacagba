/** class for the arithmetic progression
 * that inherit the original or general progression
 */
public class ArithProgression extends Progression{ //arithmetic progression

    /**
     * increment
     */
    protected long inc;

    // inherits first and cur in the general progression
    /**
     * default constructor setting a unit increment
     */
    ArithProgression(){
        this(1);
    }

    /** parametric constructor providing the increment
     *
     */
    ArithProgression(long increment) {
        inc = increment;
    }

    /** advance the progression
     * by adding the increment to the current value
     * @return next value of the progression
     */
    protected long nextValue(){
        cur += inc;
        return cur;
    }

    // inherits method firstValue() abd printProgression(int)
}
