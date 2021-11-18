package ecn.info.medev_monopoly_ei3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Plateau {
    ArrayList<Case> cases;
    LinkedList<Joueur> joueurs;

    public Plateau() {

    }
    
    public Plateau(ArrayList<Case> c, LinkedList<Joueur> j){
        cases = c;
        joueurs = j;
    }
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
