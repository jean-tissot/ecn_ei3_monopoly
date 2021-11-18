package main.java.ecn.info.medev_monopoly_ei3;

/**
 *
 * @author bodet
 */
public class Gare extends Achetable {

    public Gare() {
        super();
    }

    /**
     * Constructeur de gare
     * @param prix prix de la gare
     * @param proprietaire joueur proprietaire de la gare
     * @param nom nom de la gare
     */
    public Gare(int prix, Joueur proprietaire, String nom) {
        super(prix, proprietaire, nom);
    }
    
    
    /**
     * Calcule du loyer de la gare en fonction du nombre de gares possédées par le joueur.
     * @return le loyer
     */
    @Override
    public int calculLoyer() {
        int loyer;
        
        if (this.getProprietaire()==null){
            loyer=0;
        }
        
        else{
        loyer = 2500 * this.getProprietaire().getPlateau().nbGares(this.getProprietaire());
        }
        return loyer;
    }

    /**
     * Ajout du loyer de la gare dans le toString
     * @return 
     */
    @Override
    public String toString() {
        String res = super.toString();
        if (this.getProprietaire()!=null){
            res = res + ", loyer = "+this.calculLoyer();
        }
        
        else{
            
        }
        return res;
    }
}
