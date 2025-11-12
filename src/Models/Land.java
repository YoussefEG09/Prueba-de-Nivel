package Models;

import Enums.TractionType;
import Interfaces.ResistanceEvaluable;

import java.util.Date;

public class Land extends Robot implements ResistanceEvaluable {
    private final int maxSpeed;
    private final TractionType tractionType;

    public Land(String name, String manufacturer, int manufacturedYear, Date registrationDate, int maxSpeed, TractionType tractionType) {
        super(name, manufacturer, manufacturedYear, registrationDate);
        this.maxSpeed = maxSpeed;
        this.tractionType = tractionType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public TractionType getTractionType() {
        return tractionType;
    }


    @Override
    public String getTechnicalDescription() {
        return getName() + ", manufactured by " + getManufacturer() + " in " + getManufacturedYear()
                + ", uses " + getTractionType() + " traction and reaches speeds up to " + getMaxSpeed() + " km/h.";
    }

    @Override
    public String getResistanceReport() {
        String able = " is able to participate in the competition";
        if (!getTractionType().equals(TractionType.TRACKS)) {
            able = "Sorry, but you robot is not able to participate in the competition";
        }

        return getName() + able;
    }
}