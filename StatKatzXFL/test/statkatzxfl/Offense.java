/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statkatzxfl;

/**
 *
 * @author Cody
 */
class Offense {
    private final int passingYards;
    private final int rushingYards;
    private final int pointsScored;
    private final int turnovers;
    private final int playsRun;

    Offense(int pYards, int rYards, int points, int to, int plays) {
        passingYards = pYards;
        rushingYards = rYards;
        pointsScored = points;
        turnovers = to;
        playsRun = plays;
    }

    public double totalOffense() {
        double totalO = 0;
        totalO = passingYards + rushingYards;
        return totalO;
    }

    public double offensiveEfficiency() {
        return offEff;
    }
    
}
