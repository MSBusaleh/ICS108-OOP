package Module01;

import java.util.Objects;

public class City implements Comparable<City>, Cloneable {
    private String cityName;
    private int temperature;

    public City(String cityName, int temperature){
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(City o) {
        if(o.temperature > temperature)
            return 1;
        else if(o.temperature < temperature)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(! (o instanceof City))
            return false;

        City e = (City)o;
        if(cityName.equals(e.cityName) && temperature == e.temperature)
            return true;
        else
            return false;
    }

    @Override
    public City clone(){
        City c = new City(cityName, temperature);
        return c;
    }

    @Override
    public String toString() {
        return "City: " + cityName + "\nTemperature:" + temperature;
    }
}

