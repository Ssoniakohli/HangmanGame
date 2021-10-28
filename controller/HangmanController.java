/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Hangman.controller;

import com.sg.Hangman.dao.HangmanDao;
import com.sg.Hangman.dao.HangmanDaoException;
import com.sg.Hangman.dao.HangmanDao;
import com.sg.Hangman.dao.HangmanDaoException;
import com.sg.Hangman.dto.Hangmandto;
import com.sg.Hangman.dto.Hangmandto;



import com.sg.Hangman.ui.HangmanView;
import com.sg.Hangman.ui.HangmanView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ModuleLayer.Controller;
import java.util.Arrays;
import java.util.List;



/**
 *
 * @author HP
 */
public class HangmanController {
    HangmanView view;
    HangmanDao dao;
    public HangmanController(HangmanDao dao, HangmanView view) {
        this.dao = dao;
        this.view = view;
    }
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            menuSelection = getMenuSelection();
            switch (menuSelection) {
                
                case 1:
                    head();
                    break;
                case 2:
                    body();
                    break;
                    
                case 3:
                   rightarm();
                    break;
                case 4:
                    leftarm();
                    break;
                case 5:
                    body2();
                    break;
                case 6:
                    rightleg();
                    break;
                case 7:
                    leftleg();
                    break;
                    
                case 8:
                    keepGoing = false;
                    break;
               
                   
            }
        }
       
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void list() throws HangmanDaoException{
        view.displayListAllDvdsBanner();
        List<Hangmandto> dvdList = dao.getAllword();
        view.displayhangList(dvdList);
    }
      private void addword() throws HangmanDaoException{
        view.displayAddDvdBanner();
        Hangmandto newDvd = (Hangmandto) view.getNewhangInfo();
        dao.addword(newDvd.getTitle(), newDvd);
        view.displayAddDvdSuccessBanner();
    }
    
    private void searchAndViewword() throws HangmanDaoException{
        view.displaySearchDvdByNameBanner();
        String dvdTitle = view.getDvdTitleChoice();
        Hangmandto dvd = dao.getword(dvdTitle);
        view.displayDvd(dvd);
    }

    private void head() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void body() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void rightarm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void leftarm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void body2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void rightleg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void leftleg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}  

    