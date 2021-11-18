/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe eau
 * 
 * @author uble
 */
public class CompagnieDesEaux extends NonAchetable {
    /**
     * Méthode d'affichage
     * 
     * @return
     */
    @Override
    public String toString() {
        String message = "Chance";
        return (message);
    }

    public CompagnieDesEaux(int position) {
        super(position);
    }

}
