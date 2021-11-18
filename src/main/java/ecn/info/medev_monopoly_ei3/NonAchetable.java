/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe non achetable
 * @author uble
 */
public abstract class NonAchetable extends Case{
    
    /**
     * Abstract method for the toString
     * @return
     */
    @Override
    public abstract String toString();
    
    /**
     * Constructeur classe Non Achetable
     */
    public NonAchetable(){
        this.setPosition(0);
    }
}
