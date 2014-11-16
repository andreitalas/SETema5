package ip.teme.lab.factories;

import ip.teme.lab.lines.LineFactory;
import ip.teme.lab.tools.ToolFactory;

/**
 * Created by Andrei on 16.11.2014.
 *
 * This is the factory producer class
 */
public class FactoryProducer {
    /**
     * This is the method which gets a factory
     * @param option is the name of the option
     * @return a factory object
     */
    public static AbstractFactory getFactory(String option){
        if(option.equalsIgnoreCase("Line"))
            return new LineFactory();
        if (option.equalsIgnoreCase("Tool"))
            return new ToolFactory();
        return null;
    }
}
