package Models;

import Enums.PropulsionSystem;

import java.util.Date;

public class Aquatic  extends Robot{
    private int maxDepth;
    private PropulsionSystem propulsionSystem;

    public Aquatic (String name, String manufacturer, int manufacturedYear, Date registrationDate, int maxDepth, PropulsionSystem propulsionSystem) {
        super (name, manufacturer, manufacturedYear, registrationDate);
        this.maxDepth = maxDepth;
        this.propulsionSystem = propulsionSystem;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }


    @Override
    public String getTechnicalDescription() {
        return getName() + " reaches a depth of " + getMaxDepth() + "m with " + getPropulsionSystem() + " propulsion. Manufactured by " +
                getManufacturer() + " in " + getManufacturedYear() + ".";
    }
}
