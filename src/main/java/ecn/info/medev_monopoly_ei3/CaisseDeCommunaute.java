/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe Caisse de Communauté
 * 
 * @author uble
 */
public class CaisseDeCommunaute extends NonAchetable {
    /**
     * Méthode d'affichage
     * 
     * @return
     */
    @Override
    public String toString() {
        String message = "Caisse de Communauté";
        return (message);
    }

    public CaisseDeCommunaute(int position) {
        super(position);
    }

}
