/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Hangman;

import com.sg.Hangman.controller.HangmanController;

import com.sg.Hangman.dao.HangmanDao;
import com.sg.Hangman.dao.HangmanDaoImpl;

import com.sg.Hangman.ui.HangmanView;

import com.sg.Hangman.ui.UserIO;
import com.sg.Hangman.ui.UserIOConsoleImpl;

/**
 *
 * @author HP
 */

public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        HangmanView myView = new HangmanView(myIo);
        HangmanDao myDao = (HangmanDao) new HangmanDaoImpl();
        HangmanController controller = new HangmanController(myDao, myView);
        controller.run();
    }
}
