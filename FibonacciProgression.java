/**
 * class for fibonacci progression
 */
public class FibonacciProgression extends Progression {
    /**
     * previous value
     */
    long prev;
    // inherits variable cur and first

    FibonacciProgression(){
        this(0,1);
    }

    /** parametric constructor proving first and second value
     *
     * @param value1 first value
     * @param value2 second value
     */
    FibonacciProgression(long value1, long value2) {
        first = value1;
        prev = value2 - value1; // fictitious value preceding the first
    }

    /** advance the progression by adding the previous value to the current value
     *
     * @return next value of the progression
     */
    protected long nextValue() {
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }

    // inherits method firstValue and printProgression(int)
}
