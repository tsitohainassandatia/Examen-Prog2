package examen;

import java.time.Instant;
import java.time.LocalDate;

public class Frais {
    private int id;
    private String label;
    private double montant;
    private Instant deadline;
    public enum Status{
        IN_PROGRESS,
        PAID,
        LATE,
        OVERPAID
    }

    public Frais (int id, String label, double montant, Instant deadline){
        this.id=id;
        this.label=label;
        this.montant=montant;
        this.deadline=deadline;
    }

    public int getId() {
        return id;
    }
    public double getMontant() {
        return montant;
    }
    public String getLabel() {
        return label;
    }
    public Instant getDeadline() {
        return deadline;
    }

    public void Status(Instant t){
        if ((getDeadline().isBefore(t))&&(getMontant()<this.montant)) {
            return ;
        } else if (getMontant()==this.montant) {
            return ;
        } else if (getDeadline().isAfter(t)) {
            return ;
        } else if (getMontant()>this.montant) {
            return ;
        }
    }
}
