package main.java.ecn.info.medev_monopoly_ei3;

/**
 *
 * @author uble
 */
public class testUnit {
    public static void main(String[] args) {
        Chance chance = new Chance();
        System.out.println(chance.ChanceTest());
        Depart depart = new Depart();
        System.out.println(depart.DepartTest());
        Prison prison = new Prison();
        System.out.println(prison.PrisonTest());
        ParcGratuit parc = new ParcGratuit();
        System.out.println(parc.ParcTest());
        AllerEnPrison aller = new AllerEnPrison();
        System.out.println(aller.AllerTest());
    }
}
