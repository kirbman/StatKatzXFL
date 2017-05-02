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
class Team {
    Quarterback qb1;
    Offense off1;
    Defense def1;
    
    Team(Quarterback cutty, Offense off, Defense def) {
        qb1 = cutty;
        off1 = off;
        def1 = def;
    }

    void display() {
        System.out.println("Total defense: " + def1.totalDefense());
        System.out.println("Defensive efficiency: " + def1.defensiveEfficiency());
        System.out.println("Total offense: " + off1.totalOffense());
        System.out.println("Offensive efficiency: " + off1.offensiveEfficiency());
        System.out.println("QBR: " + QBRcalc());
    }
    
    
}
