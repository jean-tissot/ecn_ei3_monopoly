package ecn.info.medev_monopoly_ei3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Plateau {
    ArrayList<Case> cases;
    LinkedList<Joueur> joueurs;

    /**
     * Methode pour calcule le nombre des gares que possède un joueur
     * @param j : joueur
     * @return :nombre de gares
     */
    public int nbGares(Joueur j){
        return j.calculGare();
    }

}
