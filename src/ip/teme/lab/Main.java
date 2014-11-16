package ip.teme.lab;

import ip.teme.lab.factories.AbstractFactory;
import ip.teme.lab.factories.FactoryProducer;
import ip.teme.lab.interfaces.ILine;
import ip.teme.lab.interfaces.ITool;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the main class
 */
public class Main {
    /**
     * This is also the entry in the project
     *
     * @param args is the array for arguments
     */
    public static void main(String[] args){
        //get the line factory
        AbstractFactory lineFactory= FactoryProducer.getFactory("Line");

        //get an object of Continuous Line
        ILine continuousLine=lineFactory.getLine("Continuous");

        //call the mark method for the continuousLine
        continuousLine.mark();

        //get an object of Curved Line
        ILine curvedLine=lineFactory.getLine("Curved");

        //call the mark method for the curvedLine
        curvedLine.mark();

        //get an object of Dotted Line
        ILine dottedLine=lineFactory.getLine("Dotted");

        //call the mark method for the dottedLine
        dottedLine.mark();

        //get the tool factory
        AbstractFactory toolFactory=FactoryProducer.getFactory("Tool");

        //get an object of Marker Tool
        ITool markerTool=toolFactory.getTool("Marker");

        //call the write method for markerTool
        markerTool.write();

        //get an object of Pen Tool
        ITool penTool=toolFactory.getTool("Pen");

        //call the write method for penTool
        penTool.write();

        //get an object of Pencil Tools
        ITool pencilTool=toolFactory.getTool("Pencil");

        //call the write method for pencilTool
        pencilTool.write();
    }
}
