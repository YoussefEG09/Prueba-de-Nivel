package Models;

import java.util.Date;

public abstract class Robot  {
    private final String name;
    private final String manufacturer;
    private final int manufacturedYear;
    private final Date registrationDate;

    public Robot(String name, String manufacturer, int manufacturedYear, Date registrationDate) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name.");
        }
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new IllegalArgumentException("Invalid manufacturer.");
        }
        if (manufacturedYear <= 0) {
            throw new IllegalArgumentException("Invalid manufactured year.");
        }
        if (registrationDate == null) {
            throw new IllegalArgumentException("Invalid registration date.");
        }
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufacturedYear = manufacturedYear;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public abstract String getTechnicalDescription();
}
