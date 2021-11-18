/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.info.medev_monopoly_ei3;

/**
 *
 * @author Info EI 3
 */
public abstract class Achetable extends Case{
        
    private int prix;
    private Joueur proprietaire;
    private String nom;
    
    public Achetable(){
        
    }
    
    public void acheter(Joueur j){
        if (j.getFortune() >= this.getPrix()) {
            this.setProprietaire(j);
            j.setFortune(j.getFortune()-this.getPrix());
        }
        else {
            System.out.println("Le joueur n'a pas la fortune nécessaire.");

        }
    }
    
    public abstract int calculLoyer();
    
    
    public int getPrix() {
        return prix;
    }
    
    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    public Joueur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }
    
    
    
    @Override
    public String toString(){
        String s="";
        
        
        return s;
    }
    
}
