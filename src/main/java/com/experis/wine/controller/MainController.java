package com.experis.wine.controller;

import com.experis.wine.StatefulWineLottery;
import com.experis.wine.WineLottery;
import com.experis.wine.model.EnterRaffleRequest;
import com.experis.wine.model.RaffleResponse;
import com.experis.wine.model.Wine;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

@RestController
@RequestMapping("/api")
public class MainController {

    private WineLottery wineLottery = new StatefulWineLottery();
    private PriorityQueue<Wine> wines = new PriorityQueue<>(Comparator.comparingInt(Wine::getCost));

    @PostMapping("enterRaffle")
    public boolean enterRaffle(@RequestBody EnterRaffleRequest raffleRequest) {
        return wineLottery.reserve(raffleRequest.getTicketNumber(), raffleRequest.getEmail());
    }

    @PostMapping("addWines")
    public void addWines(@RequestBody List<Wine> wines) {
        this.wines.addAll(wines);
    }

    @GetMapping("startRaffle")
    public RaffleResponse startRaffle() {
        String email = wineLottery.raffle();
        return new RaffleResponse(wines.poll(), email);
    }
}
