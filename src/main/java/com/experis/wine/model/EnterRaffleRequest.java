package com.experis.wine.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class EnterRaffleRequest {
    @NotBlank
    @Email
    private final String email;
    @Min(0)
    @Max(99)
    private final int ticketNumber;

    public EnterRaffleRequest(String email, int ticketNumber) {
        this.email = email;
        this.ticketNumber = ticketNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
}
