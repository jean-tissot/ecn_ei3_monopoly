/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 * Classe Main du projet Monopoly MEDEV EI3
 * @author Louis
 */
public class Main {
    
    /**
     * Méthode main
     * @param args 
     */
    public static void main(String[] args){
        
        Plateau plateau = new Plateau();
        plateau.tourDeJeu();
        
//        int nb_joueur = plateau.getJoueurs().size();
//        
//        while(!plateau.finDePartie()){
//                        
//            int i = 0;
//            while(i < nb_joueur){
//                Joueur joueur_i = plateau.getJoueur().get(i);
//                try{
//                joueur_i.tourDeJeu();
//                }catch(NoMoreMoney e){
//                    System.out.println("Le joueur " + joueur_i.getNom() + " a perdu");
//                    joueur_i.libererProprietes();
//                    plateau.getJoueur().remove(i);
//                    nb_joueur--;
//                    i--;
//                }
//                finally{
//                    i++;
//                }
//            }
//        }
//        
//        if(plateau.finDePartie()){
//            System.out.println("Le joueur " + plateau.getJoueur().get(0).getNom() + " a gagné la partie");
//            System.exit(0);
//        }
        
    }
    
}
