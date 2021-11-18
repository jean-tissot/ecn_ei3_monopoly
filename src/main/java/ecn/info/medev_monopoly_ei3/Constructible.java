/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.info.medev_monopoly_ei3;


import org.junit.Test;

/**
 *
 * @author bodet
 */
public class Constructible extends Achetable {

    static public int a;
    static public int b;
    
    private int nbMaison ;
    private int nbHotel ;

    
    public int calculLoyer() {
        
        int res;
        
        res += nbMaison*a + nbHotel*b;
        return res;
        
    }

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

        res += " loyer = " + calculLoyer() + "€"
        return res;
    }

}
