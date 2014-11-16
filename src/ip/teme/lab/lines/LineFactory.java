package ip.teme.lab.lines;

import ip.teme.lab.factories.AbstractFactory;
import ip.teme.lab.interfaces.ILine;
import ip.teme.lab.interfaces.ITool;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the line factory class
 */
public class LineFactory extends AbstractFactory {
    /**
     * This is the method which gets a line
     *
     * @param nLine is the name of the line
     * @return an ILine object
     */
    @Override
    public ILine getLine(String nLine) {
        if (nLine == null)
            return null;
        if (nLine.equalsIgnoreCase("Continuous"))
            return new Continuous();
        if (nLine.equalsIgnoreCase("Curved"))
            return new Curved();
        if (nLine.equalsIgnoreCase("Dotted"))
            return new Dotted();
        return null;
    }

    /**
     * This is the method which gets a tool
     * This method is not addressed for the LineFactory class
     * This method is addressed for the ToolFactory class
     *
     * @param nTool is the name of the tool
     * @return null
     */
    @Override
    public ITool getTool(String nTool) {
        return null;
    }
}
