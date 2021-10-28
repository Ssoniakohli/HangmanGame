/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Hangman.dao;

import com.sg.Hangman.dto.Hangmandto;
import com.sg.Hangman.dto.Hangmandto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author HP
 */
    public class HangmanDaoImpl implements HangmanDao{
    public static final String DVDLIBRARY_FILE = "Hangman.txt";
    public static final String DELIMITER = "::";
    private Map<String, Hangmandto> word = new HashMap<>();
    @Override
    public List<Hangmandto> getAllword() throws HangmanDaoException {
       loadLibrary();
       return new ArrayList<>(word.values());
    }
   // @Override
    public Hangmandto addDvd(String hangTitle, Hangmandto word) throws HangmanDaoException{
        Hangmandto newword = word.put(hangTitle, word);
        writeLibrary();
        return newword;
    }
    
   @Override
    public Hangmandto getword(String hangTitle) throws HangmanDaoException {
        loadLibrary();
        return  word.get(hangTitle);
    }
    private void loadLibrary() throws HangmanDaoException {
        Scanner scanner;
        try {
            // Create Scanner for reading the file
            scanner = new Scanner(new BufferedReader(new FileReader(DVDLIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new HangmanDaoException("!!! Could not load library data into memory !!!", e);
        }
        // currentLine holds the most recent line read from the file
        String currentLine;
        String[] currentTokens;
        while (scanner.hasNextLine()) {
            // get the next line in the file
            currentLine = scanner.nextLine();
            // break up the line into tokens
            currentTokens = currentLine.split(DELIMITER);
            Hangmandto currentDvd = new Hangmandto(currentTokens[0]);
            currentDvd.setGuesses(Integer.parseInt(currentTokens[1]));
            currentDvd.setwongame(currentTokens[2]);
            currentDvd.playagain(currentTokens[3]);
            currentDvd.setranout((currentTokens[4]));
            currentDvd.setgameover(currentTokens[5]);
             word.put(currentDvd.getTitle(), currentDvd);
        }
        // close scanner
        scanner.close();
    }
    private void writeLibrary() throws HangmanDaoException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(DVDLIBRARY_FILE));
        } catch (IOException e) {
            throw new HangmanDaoException("Could not save dvd data.", e);
        }
        List<Hangmandto> hangList = this.getAllword();
        for (Hangmandto currentHangmandto : hangList) {
            out.println(currentHangmandto.getTitle() + DELIMITER
                    + currentHangmandto.getGuesses() + DELIMITER
                    + currentHangmandto.getwongame() + DELIMITER
                    + currentHangmandto.getplayagain() + DELIMITER
                    + currentHangmandto.getranout() + DELIMITER
                    + currentHangmandto.getgameover());
            // force PrintWriter to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
    }

    @Override
    public Hangmandto addword(String wordTitle, Hangmandto dvd) throws HangmanDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }