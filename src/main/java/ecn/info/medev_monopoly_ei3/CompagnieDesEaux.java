package main.java.ecn.info.medev_monopoly_ei3;

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

