/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe Départ
 * 
 * @author uble
 */
public class Depart extends NonAchetable {

    /**
     * Méthode d'affichage
     * 
     * @return
     */
    @Override
    public String toString() {
        String message = "Départ";
        return (message);
    }

    /**
     * Constructeur Départ
     */
    public Depart() {
        super(0);
    }

    public Depart(int position) {
        super(position);
    }

}
