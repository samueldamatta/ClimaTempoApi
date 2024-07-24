package com.ClimaTempo.ClimaTempo.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {
    private double temp_c;
    private Condition condition;

    public double getTemp_c() {
        return temp_c;
    }
    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }
    public Condition getCondition() {
        return condition;
    }
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return " temperatura =" + temp_c + condition;
    }
        
}
