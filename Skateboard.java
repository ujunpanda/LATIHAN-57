/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan57;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class Skateboard extends Vehicle {
    private double myBoardLength;
    
    public Skateboard(){
        myBoardLength = 3.11;
        
    }
    
    public Double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
    
}
