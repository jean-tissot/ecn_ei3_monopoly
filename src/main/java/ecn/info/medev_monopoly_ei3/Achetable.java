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
        
    }
    
    public abstract int calculLoyer();
    
    @Override
    public String toString(){
        String s="";
        
        
        return s;
    }
    
}
