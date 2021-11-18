package main.java.ecn.info.medev_monopoly_ei3;

/**
 * Classe Caisse de Communauté
 * @author uble
 */
public class CaisseDeCommunaute extends NonAchetable{
    /**
     * Méthode d'affichage 
     * @return
     */
    @Override
    public String toString(){
        String message = "Caisse de Communauté";
        return(message);
    }
    
    /**
     * Constructeur case Caisse Commu
     */
    public CaisseDeCommunaute(){
        super();
    }
    
    /**
     * Test
     * @return
     */
    public boolean AllerTest(){
        String attendu = "Caisse de Communauté";
        String resultat =  this.toString();
        if (resultat == attendu){
            return true;
        }
        else {
            return false;
        }
    }
    
}
