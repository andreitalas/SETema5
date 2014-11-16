package ip.teme.lab.tools;

import ip.teme.lab.factories.AbstractFactory;
import ip.teme.lab.interfaces.ILine;
import ip.teme.lab.interfaces.ITool;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the tool factory class
 */
public class ToolFactory extends AbstractFactory {
    /**
     * This is the method which gets a line
     * This method is not addressed for the ToolFactory class
     * This method is addressed for the LineFactory class
     *
     * @param nLine is the name of the line
     * @return null
     */
    @Override
    public ILine getLine(String nLine) {
        return null;
    }

    /**
     * This is the method which gets a tool
     *
     * @param nTool is the name of the tool
     * @return an ITool object
     */
    @Override
    public ITool getTool(String nTool) {
        if (nTool == null)
            return null;
        if (nTool.equalsIgnoreCase("Marker"))
            return new Marker();
        if (nTool.equalsIgnoreCase("Pen"))
            return new Pen();
        if (nTool.equalsIgnoreCase("Pencil"))
            return new Pencil();
        return null;
    }
}
