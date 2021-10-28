/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Hangman.dto;

/**
 *
 * @author HP
 */



public class Hangmandto {
    private String word;
    private String hiddenword;
    private String Wongame;
    private String playagin;
    private String ranout;
    private String Gameover;
    private String wongame;
    private String playagain;
    private String gameover;
    public Hangmandto(String title) {
        this.word = title;
    }
    public String getTitle() {
        return word;
    }
    public String getGuesses() {
        return hiddenword;
    }
    public void setGuesses(int Guesses) {
        this.hiddenword = hiddenword;
    }
    public String getwongame() {
        return Wongame;
    }
    public void setwongame(String wongame) {
        this.wongame = wongame;
    }
    public String getplayagain() {
        return playagain;
    }
    
    public String getranout() {
        return ranout;
    }
    public void setranout(String rainout) {
        this.ranout = ranout;
    }
    public String getgameover() {
        return gameover;
    }
   
    public void setGuesses(String Guesses) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCharacter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCharacter(String Character) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void playagain(String currentToken) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setgameover(String currentToken) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setplayagain(String playagain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setHiddenword(String Hiddenword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setword(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hangmandto put(String hangTitle, Hangmandto word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
