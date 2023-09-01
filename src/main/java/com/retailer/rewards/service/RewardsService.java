package com.retailer.rewards.service;

import com.retailer.rewards.model.Transaction;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RewardsService {
    public int calculateRewardPoints(List<Transaction> transactions) {
        int totalPoints = 0;
        for (Transaction transaction : transactions) {
            double amount = transaction.getAmount();
            if (amount > 100) {
                totalPoints += (amount - 100) * 2;
            } else if (amount > 50 && amount <= 100) {
                totalPoints += amount - 50;
            }
        }
        return totalPoints;
    }
}