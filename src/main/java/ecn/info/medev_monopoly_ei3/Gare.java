/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.info.medev_monopoly_ei3;

/**
 *
 * @author bodet
 */
public class Gare extends Achetable {
    
    /**
     * 
     * @return 
     */
    @Override
    public int calculLoyer() {
        int loyer;
        
        if (this.getProprietaire()==null){
            loyer=0;
        }
        
        else{
        loyer = 2500 * this.getProprietaire().getPlateau().calculerGare();
        }
        return loyer;
    }

    @Override
    public String toString() {
        String s;
        s = this.getNom() + " (coût : "+ this.getPrix() + " €)";
        if (this.getProprietaire()==null){
              s = s+ "- sans propriétaire";
        }
        
        else{
            s = s + "- propriétaire : "+ this.getProprietaire().getNom() + ", loyer = "+this.calculLoyer();
        }
        return s;
    }
    

}
