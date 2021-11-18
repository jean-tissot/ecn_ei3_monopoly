/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

import java.util.List;
import java.util.Iterator;

/**
 *
 * @author Valentin Molina
 * @author Noé Masson
 * @author Feibiao Wu
 */
public class Joueur {

    /**
     * @return the plateau
     */
    public Plateau getPlateau() {
        return plateau;
    }

    /**
     * @param plateau the plateau to set
     */
    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the fortune
     */
    public int getFortune() {
        return fortune;
    }

    /**
     * @param fortune the fortune to set
     */
    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    /**
     * @return the position
     */
    public Case getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Case position) {
        this.position = position;
    }
    
    private String nom ;
    private int fortune ;
    private Case position ;
    private Plateau plateau ;
    
    
    public Joueur()
    {

    }
    
    
    public Joueur(String nom, Plateau plateau)
    {
        this.nom = nom ;
        this.fortune = 100000 ;
        this.position  = new Depart();
        this.plateau = plateau ;
    }
    
    /**
     * Payer un autre joueur d'après le montant de la case où se trouve le joueur qui appelle la méthode
     * @param j 
     * @throws NoMoreMoney
     */
    public void paiement(Joueur j) throws NoMoreMoney{
        
        if(this.position instanceof Achetable){
            if(((Achetable)this.position).getProprietaire() == j){
                if(this.fortune < ((Achetable)this.position).calculLoyer()){
                    j.fortune+=this.fortune;
                    this.fortune=0;
                    throw new NoMoreMoney();
                }
                else{
                    j.fortune+=((Achetable)this.position).calculLoyer();
                    this.fortune-=((Achetable)this.position).calculLoyer();
                }
        }
        }
    }
    
    
    /**
     * Compute the number of gare owned by the Joueur.
     * This method is called by nbGares(Joueur) of class Plateau
     */
    public int calculerGare()
    {
        List<Case> cases = this.plateau.getCases();
        int nbPlateau = 0;
        
        Iterator<Case> itr = cases.listIterator();
        while(itr.hasNext())
        {
            Case currentCase = itr.next();
            if(currentCase instanceof Gare)
            {
                if(((Gare)currentCase).getNom().equals(this.nom))
                {
                    nbPlateau ++;
                }
            }
        }
        
        return nbPlateau ;
    }

    /**
     * Tour de jeu.
     * Le joueur jette un dé et l'action est effectué
     */
    public void tourDeJeu() {
        int de = lanceLeDe();

        Case newPosition = plateau.avance(position, de);
        position = newPosition;
        System.out.println("Le joueur " + nom + " est en " + position.getNom() + ".");

        if (position instanceof Achetable) {
            if ((de % 2 == 1) && (position.getProprietaire() == null)) {
                position.acheter(this);
            } else if (position.proprietaire != null) {
                if (position.getProprietaire() != this) {
                    this.paiement(position.getProprietaire());
                }
            }
        }
    }
    
    public String toString()
    {
        return "Le joueur "+this.nom+" possède "+this.fortune+"€. Il se situe sur la case : "+this.position.toString();
    }


    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random()*6))+1;
    }
    
    public void libererPropriete()
    {
        
    }
}
