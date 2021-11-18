/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.info.medev_monopoly_ei3;

/**
 *
 * @author Valentin Molina
 * @author Noé Masson
 * @author Feibiao Wu
 */
public class Joueur {
    
    private String nom ;
    private int fortune ;
    private Case position ;
    private Plateau plateau ;
    
    public Joueur(String nom, Plateau plateau)
    {
        this.nom = nom ;
        this.forture = 100000 ;
        this.position  = new Depart();
        this.plateau = plateau ;
    }
}
