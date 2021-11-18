/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe Chance
 * @author uble
 */
public class Chance extends NonAchetable{
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
     * Constructeur case Chance
     */
    public Chance(){
        super();
    }
    
    /**
     * Test
     * @return
     */
    public boolean ChanceTest(){
        String attendu = "Chance";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
    
}
