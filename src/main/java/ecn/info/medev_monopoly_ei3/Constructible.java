/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe Constructible
 *
 * @author bodet
 */
public class Constructible extends Achetable {

    /**
     * Coefficient multiplicateur du nombre de maisons.
     */
    static final private int COEFF_MAISON = 500;

    /**
     * Coefficient multiplicateur du nombre d'hôtels.
     */
    static final private int COEFF_HOTEL = 1500;

    /**
     * Nombre de maisons.
     */
    private int nbMaison;

    public void setNbMaison(int nbMaison) {
        this.nbMaison = nbMaison;
    }

    public int getNbHotel() {
        return nbHotel;
    }

    public void setNbHotel(int nbHotel) {
        this.nbHotel = nbHotel;
    }



    /**
     * Nombre d'hôtel
     */
    private int nbHotel;

    /**
     * Constructeur par défault.
     */
    public Constructible(){
        super();
        this.nbMaison = 0;
        this.nbHotel = 0;
    }

    /**
     * Constructeur de constructible
     * @param prix prix de la case
     * @param proprietaire proprietaire de la case
     * @param nom nom de la case
     */
    public Constructible(int prix, Joueur proprietaire, String nom) {
        super(prix, proprietaire, nom);
        this.nbMaison = 0;
        this.nbHotel = 0;
    }
    
    /**
     * Constructeur spécifiant le nombre de maisons et d'hôtels.
     * @param nbMaison Nombre de maisons.
     * @param nbHotel Nombre d'hôtels.
     */
    public Constructible(int nbMaison, int nbHotel, int position){
        super(position);
        this.nbMaison = nbMaison;
        this.nbHotel = nbHotel;
    }
    
    public int getNbMaison(){ 
        return this.nbMaison;
    }
    
    /**
     * Calcul de loyer. Calcul du loyer en fonction du nombre de maisons,
     * d'hotel et des coefficients a et b.
     */
    @Override
    public int calculLoyer() {

        int res;

        res = nbMaison * COEFF_MAISON + nbHotel * COEFF_HOTEL;
        return res;

    }

    
    
    /**
     * Redéfintion de toString.
     */
    @Override
    public String toString() {

        String res = super.toString();

        if (nbMaison > 0) {

            res += ", ";
            if (nbMaison == 1) {  // Pour gérer le singulier

                res += "1 maison, ";

            } else {

                res += nbMaison + " maisons, ";

            }
        }

        if (nbHotel > 0) {

            if (nbHotel == 1) {  // Pour gérer le singulier

                res += "1 hotel,";

            } else {

                res += nbHotel + " hotels,";

            }
        }

        res += " loyer = " + calculLoyer() + "€";
        return res;
    }

}
