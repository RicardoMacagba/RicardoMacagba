public class Progression { // class for numeric progression

    protected long first; // first input or value for the progression
    protected long cur; // current input or value for the progression

    /**
     * default constructor or main constructor
     */
    Progression(){
        cur = first = 0;
    }

    /** resets the value progression to the first value
     *
     * @return first value
     */
    protected long firstValue(){
        cur = first;
        return cur;
    }

    /** advance the progression to the next value
     *
     * @return the next value of the progression
     */
    protected long nextValue(){
        return ++cur; // default next value or original next value
    }

    /** Print the first n values of the progression
     *
     * @param n number of values to print
     */
    public void printProgression(int n){
        System.out.println(firstValue());
    }
}
