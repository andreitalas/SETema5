package ip.teme.lab.lines;

import ip.teme.lab.interfaces.ILine;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the class for curved lines
 */
public class Curved implements ILine {
    /**
     * This is the method which marks something with a curved line
     */
    @Override
    public void mark() {
        System.out.println("Marking with a curved line");
    }
}
