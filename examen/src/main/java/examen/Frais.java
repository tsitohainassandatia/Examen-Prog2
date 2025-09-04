package examen;

import java.time.LocalDate;

public class Frais {
    private int id;
    private String label;
    private double montant;
    private LocalDate deadline;

    public Frais (int id, String label, double montant, LocalDate deadline){
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
    public LocalDate getDeadline() {
        return deadline;
    }
}
