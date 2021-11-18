/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 *
 * @author uble
 */
public class AllerEnPrison extends NonAchetable {
    /**
     * Méthode d'affichage
     * 
     * @return
     */
    @Override
    public String toString() {
        String message = "Aller en Prison";
        return (message);
    }

    public AllerEnPrison(int position) {
        super(position);
    }

}