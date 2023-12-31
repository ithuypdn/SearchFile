/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import common.Algorithm;

/**
 *
 * @author huypd
 */
public class SearchFileProgram extends Menu<String> {
    static String[] options = {"Count Word In File", "Find File By Word", "Exit"};
    Algorithm ar;
    public SearchFileProgram() {
        super("========== Word Program ==========", options);
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> ar.countWordInFile();
            case 2 -> ar.findFileByWord();
            case 3 -> System.exit(0);
        }
    }
    
}
