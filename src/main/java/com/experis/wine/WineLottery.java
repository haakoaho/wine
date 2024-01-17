package com.experis.wine;

public interface WineLottery {
    /**
     * Reserve a ticket for the user
     *
     * @param num   the ticket number from 0 to 99
     * @param email the string
     * @return true if successful
     */
    public boolean reserve(int num, String email);

    /**
     * Picks the winner of the raffle
     *
     * @return removes the winner
     */
    public String raffle();
}
