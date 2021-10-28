/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Hangman.dao;

/**
 *
 * @author HP
 */
    public class HangmanDaoException extends Exception {
    public HangmanDaoException(String message) {
        super(message);
    }
    public HangmanDaoException(String message, Throwable cause) {
        super(message, cause);
    }
}