/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Hangman.ui;


import com.sg.Hangman.dto.Hangmandto;

import java.util.List;

/**
 *
 * @author HP
 */
public class HangmanView {
    UserIO io;
    public HangmanView(UserIO io) {
        this.io = io;
    }
    public int printMenuAndGetSelection() {
        io.print("Menu selection");
        io.print("1. Guess letter --");
        io.print("2. Guess Letter s ");
        io.print("3. Guess Letter t");
        io.print("4. Guess Letter r ");
        io.print("5. Guess -");
        io.print("6. Exit");
        
        return io.readInt("Please select from the above choices.", 1, 6);
    }
    public Hangmandto getNewhangInfo() {
        String word = io.readString("Enter a single character to guess: ");
        String Hiddenword = io.readString("Amount of  game guess");
        String wongame = io.readString("nn************ncongratulations you won!n**********");
        String playagain = io.readString("nDo you want to play again? (y/n :");
        String ranout= io.readString("you ran out from the game");
        String gameover = io.readString("gameover");
        Hangmandto currenthangs = new Hangmandto(word);
        currenthangs.setGuesses(Hiddenword);
        currenthangs.setwongame(wongame);
        currenthangs.setplayagain(playagain);
        
        return currenthangs;
    }
    public Hangmandto getEdithangInfo(Hangmandto hangs) {
        if(hangs != null){
        String word = io.readString("Enter a single character");
        String Hiddenword = io.readString("Current game guess");
        String wongame = io.readString("nn************ncongratulations you won!n**********8");
        String playagain = io.readString("nDo you want to play again? (y/n :");
        String ranout= io.readString("you ran out from the game");
        String gameover = io.readString("gameover");
            hangs.setword(word);
            hangs.setHiddenword(Hiddenword);
            hangs.setwongame(wongame);
            hangs.setranout(ranout);
            hangs.setgameover(gameover);
        }else{
            io.print("No false.");
        }
        return hangs;
    }
    public void displayhangList(List<Hangmandto> dvdList) { // note here we couldve used the display DVD method
        for (Hangmandto currentHangmandto : dvdList) {
            io.print(currentHangmandto.getCharacter() + ": "
                    + currentHangmandto.getGuesses() + " "
                    + currentHangmandto.getwongame()  + " "
                    + currentHangmandto.getplayagain()      + " "
                    + currentHangmandto.getranout()+ " "
                    + currentHangmandto.getgameover());
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayDvd(Hangmandto dvd) {
        if (dvd != null) {
            io.print( dvd.getCharacter() + ": "
                    + dvd.getGuesses() + " "
                    + dvd.getwongame()  + " "
                    + dvd.getplayagain()      + " "
                    + dvd.getranout()+ " "
                    + dvd.getgameover());
        } else {
            io.print("Hangman win.");
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayListAllDvdsBanner() {
        io.print("Hanman word id set\n\n");
    }
    public void displayAddDvdBanner() {
        io.print("oh! you ran out of guesses");
    }
    public void displayAddDvdSuccessBanner() {
        io.readString("congrats! you won");
    }
    
    public String getDvdTitleChoice() {
        return io.readString("Hidden word  ");
    }
    
     public void displaySearchDvdByNameBanner() {
        io.print("Guess a letter: ");
    }
    public void displayPromptToContinueBanner() {
        io.print("you found");
    }
    public void displayExitBanner() {
        io.print("Game over");
    }

    public void displayListAllhangssBanner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displaywordList(List<Hangmandto> dvdList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }

