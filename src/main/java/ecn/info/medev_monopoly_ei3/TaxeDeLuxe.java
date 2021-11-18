/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * classe taxe
 * @author uble
 */
public class TaxeDeLuxe extends NonAchetable{
    /**
     * Méthode d'affichage 
     * @return
     */
    @Override
    public String toString(){
        String message = "Taxe de Luxe";
        return(message);
    }
    
    /**
     * Constructeur de la case taxe
     */
    public TaxeDeLuxe(){
        super();
    }
    
    public boolean LuxeTest(){
        String attendu = "Taxe de Luxe";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
}

