package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;


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

    @Parameters({ "paper" ,"rock" })
    @org.testng.annotations.Test
    public void testWinPlay(String p1, String p2) {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }
    @Parameters({ "paper" ,"rock" })
    @org.testng.annotations.Test
    public void testTiePlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }
    @Parameters({ "scissors" ,"rock" })
    @org.testng.annotations.Test
    public void testLostPlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }
    @org.testng.annotations.Test ( dataProvider = "winData")
    void testWinPlay ( RPSEnum p1 , RPSEnum p2 ){


    }
    @org.testng.annotations.Test ( dataProvider = "lostData")
    void testWinPlay ( RPSEnum p1 , RPSEnum p2 ){


    }
    @org.testng.annotations.Test ( dataProvider = "tieData")
    void testWinPlay ( RPSEnum p1 , RPSEnum p2 ){


    }

    @org.testng.annotations.DataProvider(name="winData")
    public Object [][] winDataProvider() {
        return new Object[][] {
                {RPSEnum.ROCK,RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS,RPSEnum.PAPER},
                {RPSEnum.PAPER,RPSEnum.ROCK}
        };
    }
    @org.testng.annotations.DataProvider(name="lostData")
    public Object [][] lostDataProvider() {
        return new Object[][] {
                {RPSEnum.SCISSORS,RPSEnum.ROCK},
                {RPSEnum.PAPER,RPSEnum.SCISSORS},
                {RPSEnum.ROCK,RPSEnum.PAPER}
        };
    }
    @org.testng.annotations.DataProvider(name="tieData")
    public Object [][] tieDataProvider() {
        return new Object[][] {
                {RPSEnum.SCISSORS,RPSEnum.SCISSORS},
                {RPSEnum.PAPER,RPSEnum.PAPER},
                {RPSEnum.ROCK,RPSEnum.ROCK}
        };
    }


}