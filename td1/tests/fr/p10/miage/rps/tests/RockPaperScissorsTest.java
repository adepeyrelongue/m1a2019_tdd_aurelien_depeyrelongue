package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RockPaperScissors;


public class RockPaperScissorsTest {

    private RockPaperScissors rps;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        this.rps = new RockPaperScissors();
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
        this.rps = null;
    }

    @org.testng.annotations.Test
    public void testWinPlay() {


    }
}