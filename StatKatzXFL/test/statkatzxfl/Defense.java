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
class Defense {
    private final int passingYardsAllowed;
    private final int rushingYardsAllowed;
    private final int pointsAllowed;
    private final int turnoversForced;
    private final int tacklesForLoss;
    private final int playsRun;

    Defense(int pyA, int ryA, int points, int toF, int tfL, int plays) {
        passingYardsAllowed = pyA;
        rushingYardsAllowed = ryA;
        pointsAllowed = points;
        turnoversForced = toF;
        tacklesForLoss = tfL;
        playsRun = plays;
    }

    public double totalDefense() {
        double totalD;
        totalD = passingYardsAllowed + rushingYardsAllowed;
        return totalD;
    }

    public double defensiveEfficiency() {
        double deffEff;
        deffEff = ((totalDefense() + Math.pow(turnoversForced,2) + Math.pow(tacklesForLoss, 2))/pointsAllowed)/playsRun;
        return deffEff;;
    }
    
}
