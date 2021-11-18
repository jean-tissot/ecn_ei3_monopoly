package main.java.ecn.info.medev_monopoly_ei3;

/**
 *
 * @author Info EI 3
 */
public abstract class Case {
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    
    @Override
    public abstract String toString();
}
