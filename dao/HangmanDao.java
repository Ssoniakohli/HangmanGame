/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Hangman.dao;

import com.sg.Hangman.dto.Hangmandto;
import com.sg.Hangman.dto.Hangmandto;
import java.util.List;

/**
 *
 * @author 
 */
public interface HangmanDao {
	   
    List<Hangmandto> getAllword() throws HangmanDaoException;
    Hangmandto addword(String wordTitle, Hangmandto dvd) throws HangmanDaoException;
   
    Hangmandto getword(String wordTitle) throws HangmanDaoException;
}

    
    