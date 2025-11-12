package Models;

import Enums.TractionType;
import Interfaces.ResistanceEvaluable;

import java.util.Date;

public class Aerial extends Robot implements ResistanceEvaluable {
    private double maxAltitude;
    private int flightAutonomy;


    public Aerial(String name, String manufacturer, int manufacturedYear, Date registrationDate, double maxAltitude, int flightAutonomy) {
        super(name, manufacturer, manufacturedYear, registrationDate);
        this.maxAltitude = maxAltitude;
        this.flightAutonomy = flightAutonomy;
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    public int getFlightAutonomy() {
        return flightAutonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + " flies up to " + getMaxAltitude() + "m for " + getFlightAutonomy() +
                " minutes. Manufactured in " + getManufacturedYear() + " by " + getManufacturer() + ".";
    }

    @Override
    public String getResistanceReport() {
        String able = " is able to participate in the competition";
        if (getFlightAutonomy() < 60) {
            able = "Sorry, but you robot is not able to participate in the competition";
        }

        return getName() + able;
    }
}


