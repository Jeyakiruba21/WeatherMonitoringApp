package com.example.WeatherApp.model;

public class WeatherResponse {
    private Location location;
    private Current current;

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public Current getCurrent() { return current; }
    public void setCurrent(Current current) { this.current = current; }

    public static class Location {
        private String name;
        private String country;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getCountry() { return country; }
        public void setCountry(String country) { this.country = country; }
    }

    public static class Current {
        private double temp_c;
        private double wind_kph;

        public double getTemp_c() { return temp_c; }
        public void setTemp_c(double temp_c) { this.temp_c = temp_c; }

        public double getWind_kph() { return wind_kph; }
        public void setWind_kph(double wind_kph) { this.wind_kph = wind_kph; }
    }
}