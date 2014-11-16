package ip.teme.lab.lines;

import ip.teme.lab.interfaces.ILine;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the class for dotted lines
 */
public class Dotted implements ILine {
    /**
     * This is the method which marks something with a dotted line
     */
    @Override
    public void mark() {
        System.out.println("Marking with a dotted line");
    }
}
