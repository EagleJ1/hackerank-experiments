package com.hackerrank.test.some_interview_questions.cerner;

/**
 * Created by jackalhan on 10/14/17.
 */
public class Temperature {

    private float temperature;
    private TemperatureUnit temperatureUnit;
    private Location location;

    Temperature(float temperature, Location location, TemperatureUnit temperatureUnit) {
        this.location = location;
        this.temperature = temperature;
        this.temperatureUnit = temperatureUnit;
    }

    Temperature(Location location, TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit;

        if ("C".equals(temperatureUnit.name())) {
            this.temperature = 0;
        } else {
            this.temperature = 32;
        }
        this.location = location;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public float convertToCelcius(float temperature) {
        if ("F".equals(temperatureUnit.name())) {
            return (float) ((temperature - 32) * (5 / 9));
        }
        return temperature;
    }

    public float convertToFahrenheit(float temperature) {
        if ("C".equals(temperatureUnit.name())) {
            return (float) ((temperature * 5 / 9) + 32);
        }
        return temperature;
    }
}
