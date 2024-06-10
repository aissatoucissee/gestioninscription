package entities;


import java.util.ArrayList;
import java.util.List;
public class  Classe{
    private String libelle;
    List<Professeur>  professeurs =new ArrayList<>();
    List<Etudiant>  etudiants =new ArrayList<>();
    public Classe() {
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public List<Professeur> getProfesseurs() {
        return professeurs;
    }
    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
    public List<Etudiant> getEtudiants() {
        return etudiants;
    }
    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    }
    
  
    