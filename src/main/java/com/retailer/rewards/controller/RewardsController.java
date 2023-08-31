package com.retailer.rewards.controller;

import com.retailer.rewards.model.Transaction;
import com.retailer.rewards.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class RewardsController {

    @Autowired
    private RewardsService rewardsService;

    @PostMapping("/calculate")
    public int calculateRewards(@RequestBody List<Transaction> transactions) {
        return rewardsService.calculateRewardPoints(transactions);
    }

}
