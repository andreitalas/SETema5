package ip.teme.lab.factories;

import ip.teme.lab.interfaces.ILine;
import ip.teme.lab.interfaces.ITool;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the abstract factory class
 */
public abstract class AbstractFactory {
    /**
     * This method gets a line
     *
     * @param nLine is the name of the line
     * @return an ILine object
     */
    public abstract ILine getLine(String nLine);

    /**
     * This method gets a tool
     *
     * @param nTool is the name of the tool
     * @return an ITool object
     */
    public abstract ITool getTool(String nTool);
}
