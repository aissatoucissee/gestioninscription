package services;

import java.util.List;

import entities.Classse;
import repositories.ClasseRepository;

public class ClasseService {
    private ClasseRepository classeRepository=new ClassseRepository();
    
  public List<Classe> listerClasse(){
      returnclasseRepository.selectAll();
   }
   public void ajouterClasse(Classe classe){
    classeRepository.insert(classe);
   }
