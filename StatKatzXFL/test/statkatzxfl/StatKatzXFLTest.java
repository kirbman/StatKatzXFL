/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statkatzxfl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cody
 */
public class StatKatzXFLTest {
    
    public StatKatzXFLTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of QBR method, of class Quarterback.
     */
    @Test
    public void testQBR() {
        
    }
    
        /**
     * Test of TotalOffense method, of class Offense.
     */
    @Test
    public void testTotalOffense() {
        Offense team1 = new Offense(450,120,28,2,56);
        double totalOffense;
        totalOffense = team1.totalOffense();
        double expected = 317;
        assertEquals(expected, totalOffense, .001);
    }
    
        /**
     * Test of OffensiveEfficiency method, of class Offense.
     */
    @Test
    public void testOffensiveEfficiency() {
        
    }
    
        /**
     * Test of TotalDefense method, of class Defense.
     */
    @Test
    public void testTotalDefense() {
        Defense team1 = new Defense(250,67,10,2,4,57);
        double totalDefense;
        totalDefense = team1.totalDefense();
        double expected = 317;
        assertEquals(expected, totalDefense, .001);
    }
    
        /**
     * Test of DefensiveEfficiency method, of class Defense.
     */
    @Test
    public void testDefensiveEfficiency() {
       Defense theD = new Defense(2,2,2,2,2,2);
       double expected = 2.5;
       double deffEff = theD.defensiveEfficiency();
       assertEquals(expected, deffEff);
    }
    
        /**
     * Test of display method, of class Team.
     */
    @Test
    public void testDisplay() {

    }
}
