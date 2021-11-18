package ecn.info.medev_monopoly_ei3;

import java.util.ArrayList;

public class Plateau {
    ArrayList<Case> cases;
    LinkedList<Joueur> joueurs;

    /**
     * Methode pour calculer le nombre des gares que possède un joueur
     * @param j : joueur
     * @return :nombre de gares
     */
    public int nbGares(Joueur j){
        return j.calculGare();
    }

    /**
     * la méthode toString
     * @return le texte de sortie
     */
    public String toString() {
        // TODO
        return "";
    }

    /**
     * Méthode d'affichage
     */
    public void affiche() {
        // TODO
    }

    public Case avance(Case _case, int i) {
        return _case;
    }

    /**
     *
     */
    public void tourDeJeu() {
        // TODO
    }

    /**
     *
     */
    public boolean finDePartie() {
        // TODO
        return true;
    }
}
