package ip.teme.lab.tools;

import ip.teme.lab.interfaces.ITool;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the class for pens
 */
public class Pen implements ITool {
    /**
     * This is the method which writes something with a pen
     */
    @Override
    public void write(){
        System.out.println("Writing with a pen");
    }
}
