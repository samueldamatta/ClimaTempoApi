package com.ClimaTempo.ClimaTempo.Principal;

import com.ClimaTempo.ClimaTempo.Models.Location;
import com.ClimaTempo.ClimaTempo.Models.Current;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosClima {
    private Location location;
    private Current current;
    
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public Current getCurrent() {
        return current;
    }
    public void setCurrent(Current current) {
        this.current = current;
    }
    @Override
    public String toString() {
        return "DadosClima " + location + current;
    }

}
