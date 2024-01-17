package com.experis.wine.model;

public class RaffleResponse {
    private final Wine wine;
    private final String email;

    public RaffleResponse(Wine wine, String email) {
        this.wine = wine;
        this.email = email;
    }

    public Wine getWine() {
        return wine;
    }

    public String getEmail() {
        return email;
    }
}
