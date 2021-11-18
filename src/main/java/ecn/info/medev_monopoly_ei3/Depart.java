package main.java.ecn.info.medev_monopoly_ei3;

/**
 * Classe Départ
 * @author uble
 */
public class Depart extends NonAchetable{
    
    /**
     * Méthode d'affichage 
     * @return
     */
    @Override
    public String toString(){
        String message = "Départ";
        return(message);
    }
    
    /**
     * Constructeur Départ
     */
    public Depart(){
        super();
    }
    public boolean DepartTest(){
        String attendu = "Départ";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
}
