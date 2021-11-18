/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Compagnie d'electricité
 * @author uble
 */
public class CompagnieElectricite extends NonAchetable{
        /**
     * Méthode d'affichage 
     * @return
     */
    @Override
    public String toString(){
        String message = "Compagnie d'electricité";
        return(message);
    }
    
    /**
     * Constructeur case Compagnie elec
     */
    public CompagnieElectricite(){
        super();
    }
    
 
}


