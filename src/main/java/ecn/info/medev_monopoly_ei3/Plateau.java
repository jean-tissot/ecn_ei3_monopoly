package ecn.info.medev_monopoly_ei3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Plateau {
    ArrayList<Case> cases;
    LinkedList<Joueur> joueurs;

    public Plateau() {

    }

    public Plateau(ArrayList<Case> c, LinkedList<Joueur> j) {
        cases = c;
        joueurs = j;
    }

    public ArrayList<Case> getCases() {
        return cases;
    }

    public LinkedList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setCases(ArrayList<Case> cases) {
        this.cases = cases;
    }

    public void setJoueurs(LinkedList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    /**
     * Methode pour calculer le nombre des gares que possède un joueur
     * 
     * @param j : joueur
     * @return :nombre de gares
     */
    public int nbGares(Joueur j) {
        return j.calculerGare();
    }

    /**
     * Méthode d'affichage
     */
    public void affiche() {
        // TODO
        String[][] tab = new String[55][121];
        String[][] cas = new String[5][11];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {

                cas[i][j] = " ";
            }
        }
        for (int i = 0; i < 55; i++) {
            for (int j = 0; j < 121; j++) {
                tab[i][j] = " ";
            }
        }

        for (int j = 1; j < 10; j++) {
            cas[0][j] = "-";
        }
        for (int i = 0; i < 3; i++) {
            cas[i + 1][0] = "|";
            cas[i + 1][10] = "|";
        }
        for (int j = 1; j < 10; j++) {
            cas[2][j] = "-";
        }

        for (int j = 1; j < 10; j++) {
            cas[4][j] = "-";
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(cas[i][j]);
            }
            System.out.println("");
        }
        // creation du plateau :
        for (int h = 0; h < 121; h = h + 11) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 11; j++) {
                    tab[i][h + j] = cas[i][j];
                }
            }

        }
        // traitement des cases a l'interieur :
        for (int u = 5; u < 50; u = u + 5) {
            for (int h = 0; h < 11; h = h + 11) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 11; j++) {
                        tab[i + u][h + j] = cas[i][j];
                    }
                }
            }
            for (int h = 110; h < 121; h = h + 11) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 11; j++) {
                        tab[i + u][h + j] = cas[i][j];
                    }
                }
            }
        }

        for (int h = 0; h < 121; h = h + 11) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 11; j++) {
                    tab[i + 50][h + j] = cas[i][j];
                }
            }
        }
        // pour l'affichage

        for (int i = 0; i < 55; i++) {
            for (int j = 0; j < 121; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println("");
        }
    }

    /**
     * Methode d'avancement
     * 
     * @param _case
     * @param d
     * @return
     */
    public Case avance(Case _case, int d) {
        int j = (_case.getPosition() + d) % cases.size();
        return cases.get(j);
    }

    /**
     * Méthode permettant de tester si la partie est finie ou non
     * 
     * @return boolean
     */
    public boolean finDePartie() {
        if (this.joueurs.size() <= 1) { // if 1 player remains (or less)
            return true;
        } else {
            return false;
        }
    }

    /**
     * Méthode permettant de réaliser une partie jusqu'à la fin
     */
    public void tourDeJeu() {

        // tant que la partie n'est pas fini
        while (!this.finDePartie()) {

            for (Joueur j : this.joueurs) {
                try {
                    j.tourDeJeu(); // tour de jeu de chaque joueur
                } catch (NoMoreMoney e) {
                    System.out.println("Le joueur " + j.getNom() + " a perdu");
                    j.libererProprietes();
                    this.joueurs.remove(j);
                }
            }
        }
    }

}
