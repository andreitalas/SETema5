package ip.teme.lab.tools;

import ip.teme.lab.interfaces.ITool;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the class for markers
 */
public class Marker implements ITool {
    /**
     * This is the method which writes something with a marker
     */
    @Override
    public void write(){
        System.out.println("Writing with a marker");
    }
}
