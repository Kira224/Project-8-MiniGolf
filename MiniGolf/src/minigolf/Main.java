/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

/**
 *
 * @author Kira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
  
    //skeleton classes
    // dont need to be implemented so just having it return null so it runs
    // creates and stores a new round object and returns reference to Round object
    public static Round newRound(String courseName, String playerName){
        // not doing rounds
        return null;
           
    }
    // looks up Round object
    public static Round getRound(String player, String coursename){
        // not doing rounds
        return null;
    }
    //returns course object
    public static Course getCourse(String courseName){
        return null;
        
    }
    //looks up round information and returns score so far at swipe station
    public static int scoreSoFar(String courseName, String playerName){
        return 0;
    
    }
    //redundant method, will also be used by swipe station to enter score
    public void enterStrokes(String courseName, String playerName, int strokes){
    
    }
    
}
