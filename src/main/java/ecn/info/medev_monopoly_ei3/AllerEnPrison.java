package main.java.ecn.info.medev_monopoly_ei3;

/**
 *
 * @author uble
 */
public class AllerEnPrison extends NonAchetable{
    /**
     * Méthode d'affichage 
     * @return
     */
    @Override
    public String toString(){
        String message = "Aller en Prison";
        return(message);
    }
    
    /**
     * Constructeur case Chance
     */
    public AllerEnPrison(){
        super();
    }
    
    public boolean AllerTest(){
        String attendu = "Aller en Prison";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
    
}