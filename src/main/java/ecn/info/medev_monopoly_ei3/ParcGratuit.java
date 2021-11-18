/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe Parc Gratuit
 * @author uble
 */
public class ParcGratuit extends NonAchetable {
    /**
     * Méthode d'affichage 
     * @return
     */
    @Override
    public String toString(){
        String message = "Parc gratuit";
        return(message);
    }
    
    /**
     * Constructeur case Chance
     */
    public ParcGratuit(){
        super();
    }
    
    public boolean ParcTest(){
        String attendu = "Parc gratuit";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
    
}