package main.java.ecn.info.medev_monopoly_ei3;

/**
 * Classe des cases achetables par un joueur
 * @author Info EI 3
 */
public abstract class Achetable extends Case{
    private int prix;
    private Joueur proprietaire;
    private String nom;
    
    public Achetable(){
    }

    /**
     * Constructeur de achetable
     * @param prix prix de la case
     * @param proprietaire joueur propriétaire
     * @param nom nom de la case
     */
    public Achetable(int prix, Joueur proprietaire, String nom) {
        this.prix = prix;
        this.proprietaire = proprietaire;
        this.nom = nom;
    }
    
    
    
    /**
     * Permet au joueur d'acheter une case.
     * 
     * @param j Joueur qui achète la case
     */
    public void acheter(Joueur j){
        
        if (this.proprietaire!=null){
            System.out.println("La case a déjà un propriétaire.");
        }
        else if (j.getFortune() >= this.getPrix()) {
            this.setProprietaire(j);
            j.setFortune(j.getFortune()-this.getPrix());
        }
        else {
            System.out.println("Le joueur n'a pas la fortune nécessaire.");

        }
    }
    
    /**
     * Calcul d'un loyer pour la case.
     * 
     * @return le loyer
     */
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    /**
     * Renvoie le nom, le coût et le propriétaire s'il existe
     * @return 
     */
    @Override
    public String toString(){
        String s;
        s = this.getNom() + " (coût : "+ this.getPrix() + " €)";
        if (this.getProprietaire()==null){
              s = s+ "- sans propriétaire";
        }
        
        else{
            s = s + "- propriétaire : "+ this.getProprietaire().getNom();
        }
        return s;
    }
}
