package fr.p10.miage.rps.model;

public class RockPaperScissors {

    public Result play(RPSEnum p1, RPSEnum p2){

        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK){

            return Result.WIN;

        }
        else if (p1==p2){

            return Result.TIE;

        }
        else if (p1 == RPSEnum.SCISSORS && p2 == RPSEnum.ROCK){

            return Result.LOST;

        }
        else
            return null;
    }

}
