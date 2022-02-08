package Keno;

import java.util.Set;

public class Payout {
    double payoutRate;
    double totalPayout;

    private double[][] payoutTable =
    {
        {0, 3},
        {0, 1, 9},
        {0, 1, 2, 16},
        {0, 0.5, 2, 6, 12},
        {0, 0.5, 1, 3, 15, 50},
        {0, 0.5, 1, 2, 3, 30, 75},
        {0, 0.5, 0.5, 1, 6, 12, 36, 100},
        {0, 0.5, 0.5, 1, 3, 6, 19, 90, 720},
        {0, 0.5, 0.5, 1, 2, 4, 8, 20, 80, 1200},
        {0, 0, 0.5, 1, 2, 3, 5, 10, 30, 600, 1800},
        {0, 0, 0.5, 1, 1, 2, 6, 15, 25, 180, 1000, 3000},
        {0, 0, 0, 0.5, 1, 2, 4, 24, 72, 250, 500, 2000, 4000},
        {0, 0, 0, 0.5, 0.5, 3, 4, 5, 20, 80, 240, 500, 3000, 6000},
        {0, 0, 0, 0.5, 0.5, 2, 3, 5, 12, 50, 150, 500, 1000, 2000, 7500},
        {0, 0, 0, 0.5, 0.5, 1, 2, 5, 15, 50, 150, 300, 600, 1200, 2500, 10000}
    };

    public double getTotalPayout() {
        return totalPayout;
    }

    public double getPayoutRate(int size, int hit) {
        payoutRate = payoutTable[size-1][hit];
        return payoutRate;
    }

    public void showPayout(double betPerRound) {
        totalPayout = payoutRate*betPerRound;
        System.out.println("Payout rate is: " + payoutRate + " thus you came out with: $"+totalPayout);
    }

}