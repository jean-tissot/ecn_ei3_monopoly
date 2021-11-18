package ecn.info.medev_monopoly_ei3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Plateau {
    ArrayList<Case> cases;
    LinkedList<Joueur> joueurs;

    public Plateau() {

    }

    public Plateau(ArrayList<Case> c, LinkedList<Joueur> j){
        cases = c;
        joueurs = j;
    }

    public ArrayList<Case> getCases() {
        return cases;
    }

    public Queue<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setCases(ArrayList<Case> cases) {
        this.cases = cases;
    }

    public void setJoueurs(Queue<Joueur> joueurs) {
        this.joueurs = joueurs;
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

    public Case avance(Case _case, int d) {
        int j = (Case.position + d) % cases.size();
        return cases.get(j);
    }

    /**
     *
     */
    public void tourDeJeu() {
        while (!finDePartie()) {
            (joueurs.next()).tourDeJeu();
        }

    }

    /**
     *
     */
    public boolean finDePartie() {
        // TODO
        return true;
    }
}
