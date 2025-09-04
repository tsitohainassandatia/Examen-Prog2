package examen;

import java.time.Instant;

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
    };
    private Status status;
    
    

    public Frais (int id, String label, double montant, Instant deadline, Status status){
        this.id=id;
        this.label=label;
        this.montant=montant;
        this.deadline=deadline;
        this.status=status;
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

    public Status getStatus(){
        if (()&&()) {
            return status.IN_PROGRESS;
        } else if (getMontant()==) {
            return status.PAID;
        } else if (getDeadline().isAfter(deadline)) {
            return status.OVERPAID;
        } else if (getMontant()>this.montant) {
            return status.LATE;
        }
    }
}
