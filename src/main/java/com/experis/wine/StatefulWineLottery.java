package com.experis.wine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StatefulWineLottery implements WineLottery {

    private final String[] reservedTickets = new String[100];
    List<Integer> ticketNumber = new ArrayList<>();
    private final Random random = new Random();

    public boolean reserve(int ticketNumber, String email) {
        if (ticketNumber >= 100 || ticketNumber < 0)
            throw new IllegalArgumentException("tickets must be in range from 0 to 99");
        if (reservedTickets[ticketNumber] != null) return false;
        reservedTickets[ticketNumber] = email;
        this.ticketNumber.add(ticketNumber);
        return true;
    }

    public String raffle() {
        if (ticketNumber.isEmpty()) throw new IllegalArgumentException("no participants in raffle");
        int index = random.nextInt(ticketNumber.size());
        return reservedTickets[ticketNumber.remove(index)];
    }


}
