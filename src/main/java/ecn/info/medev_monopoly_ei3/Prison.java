package main.java.ecn.info.medev_monopoly_ei3;

/**
 * Classe prison
 * @author uble
 */
public class Prison extends NonAchetable{
    /**
     * Méthode d'affichage 
     * @return
     */
    @Override
    public String toString(){
        String message = "Prison";
        return(message);
    }
    
    /**
     * Constructeur de la case Prison
     */
    public Prison(){
        super();
    }
    
    public boolean PrisonTest(){
        String attendu = "Prison";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
}
