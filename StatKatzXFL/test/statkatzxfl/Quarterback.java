package statkatzxfl;

/**
 *
 * @author Cody
 */
class Quarterback {
    private final int passingYards;
    private final int rushingYards;
    private final int touchdowns;
    private final int interceptions;
    private final double completionPercentage;
   

    Quarterback(int pyards, int ryards, int td, int interc, double compPerc) {
        passingYards = pyards;
        rushingYards = ryards;
        touchdowns = td;
        interceptions = interc;
        completionPercentage = compPerc;
    }

    public double QBRcalc() {
        return qbr;
    }
    
}
