package entities;



import java.util.ArrayList;
import java.util.List;
public class Professeur {
    private int id;
    private String nom;
    private String prenom;
    private int telephone;
    private String addresse;

    List<Etudiant>  etudiants =new ArrayList<>();
    List<Classe> classes =new ArrayList<>();
    public Professeur() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public String getAddresse() {
        return addresse;
    }
    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
    public List<Etudiant> getEtudiants() {
        return etudiants;
    }
    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
    public List<Classe> getClasses() {
        return classes;
    }
    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }
    }