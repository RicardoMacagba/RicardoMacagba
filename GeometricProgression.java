/**
 * class for Geometric Progression
 */
public class GeometricProgression extends Progression{

    protected long base; // base

    // inherits variable first and cur in the general progression

    /**
     * default constructor setting base 2
     */
    GeometricProgression(){
        this(2);
    }

    /** parametric constructor providing the base
     *
     * @param b base of the progression
     */
    GeometricProgression(long b){
        base = b;
        first = 1;
        cur = first;
    }

    /** advance the progression by multiplying
     * the base with the current value
     * @return the next value of the progression
     */
    protected long nextValue(){
        cur *= base;
        return cur;
    }

    // inherits firstValue() and printProgression(int).
}
