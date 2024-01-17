package com.experis.wine.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Wine {
    @NotBlank
    private final String model;
    @Min(0)
    private final int cost;

    public Wine(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }
}
