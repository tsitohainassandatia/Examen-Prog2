package examen;

import java.time.LocalDate;
import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateDeRentree;
    private List<Groupe> groupes;

    public Etudiant(int id, String nom, String prenom, LocalDate dateDeRentree, List<Groupe> groupes){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.dateDeRentree=dateDeRentree;
        this.groupes=groupes;
    }

    public int getId(){
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public LocalDate getDateDeRentree() {
        return dateDeRentree;
    }
    public List<Groupe> getGroupes() {
        return groupes;
    }
}
