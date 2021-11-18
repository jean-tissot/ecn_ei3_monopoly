package main.java.ecn.info.medev_monopoly_ei3;

/**
 * Classe non achetable
 * @author uble
 */
public abstract class NonAchetable extends Case{
    
    /**
     * Abstract method for the toString
     * @return
     */
    @Override
    public abstract String toString();
    
    /**
     * Constructeur classe Non Achetable
     */
    protected NonAchetable(){
        this.setPosition(0);
    }
}
