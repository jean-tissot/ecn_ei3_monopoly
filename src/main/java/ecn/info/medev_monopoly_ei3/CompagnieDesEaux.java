/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe eau
 * @author uble
 */
public class CompagnieDesEaux extends NonAchetable{
        /**
     * Méthode d'affichage 
     * @return
     */
    @Override
    public String toString(){
        String message = "Chance";
        return(message);
    }
    
    /**
     * Constructeur case Compagnie des eaux
     */
    public CompagnieDesEaux(){
        super();
    }
    
    /**
     * Test
     * @return
     */
    public boolean EauTest(){
        String attendu = "Compagnie des eaux";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
    
}

