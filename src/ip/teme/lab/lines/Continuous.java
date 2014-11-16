package ip.teme.lab.lines;

import ip.teme.lab.interfaces.ILine;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the class for continuous lines
 */
public class Continuous implements ILine {
    /**
     * This is the method which marks something with a continuous line
     */
    @Override
    public void mark() {
        System.out.println("Marking with a continuous line");
    }
}
