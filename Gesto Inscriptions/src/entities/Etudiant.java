package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Etudiant {
    public Etudiant() {
    }
    private int matricule;
    private String nom;
    private int telephone;
    private Date datenaiss;

    List<Professeur>  professeurs =new ArrayList<>();
     Classe classe ;
     Inscription inscription ;
    public int getMatricule() {
        return matricule;
    }
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public Date getDatenaiss() {
        return datenaiss;
    }
    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
    }
    public List<Professeur> getProfesseurs() {
        return professeurs;
    }
    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public Inscription getInscription() {
        return inscription;
    }
    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }
    }
