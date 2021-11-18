package main.java.ecn.info.medev_monopoly_ei3;

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
    
    /**
     * Test
     * @return
     */
    public boolean ElecTest(){
        String attendu = "Compagnie d'electricité";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
    
}


