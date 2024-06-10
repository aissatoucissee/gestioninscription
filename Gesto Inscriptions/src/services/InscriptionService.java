package services;

import java.util.List;

import entities.Inscription;
import entities.Professeur;
import repositories.ProfesseurRepository;

public class InscriptionService {
    private ProfesseurRepository professeurRepository=new ProfesseurRepository();

    public ProfesseurRepository getProfesseurRepository() {
        return professeurRepository;
    }

    public void setProfesseurRepository(ProfesseurRepository professeurRepository) {
        this.professeurRepository = professeurRepository;
    }

    public void ajouterInscription(Inscription inscription){
        Object inscriptionRepository;
        inscriptionRepository.insert(inscription);
}
}