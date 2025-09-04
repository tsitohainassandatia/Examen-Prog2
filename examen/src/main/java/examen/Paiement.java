package examen;

import java.time.Instant;

public class Paiement {
    private int id;
    private double montantPaye;
    private Instant dateEtHeure;

    public Paiement(int id, double montantPaye, Instant dateEtHeure){
        this.id=id;
        this.montantPaye=montantPaye;
        this.dateEtHeure=dateEtHeure;
    }

    public int getId() {
        return id;
    }
    public double getMontantPaye() {
        return montantPaye;
    }
    public Instant getDateEtHeure() {
        return dateEtHeure;
    }
}
