import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Classe;
import entities.Inscription;
import entities.Professeur;
import services.InscriptionService;


public class Views {
    public static void main(String[] args) throws Exception {
       int choix;
        Scanner sc=new Scanner(System.in);
        do {System.out.println("1-créer des classes");
            System.out.println("2-Lister les classes"); 
            System.out.println("3-affecter des classes aux profs"); 
            System.out.println("4-ajouter des profs");
            System.out.println("5-filtrer les classes d'un prof"); 
            System.out.println("6-lister les profs"); 
            System.out.println("7-faire une inscription ou réinscription"); 
            System.out.println("8-lister les étudiants inscrits dans une année");
            System.out.println("9-filtrer la liste des étudiants par classe");
            System.out.println("10-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            Object classeService;
          Object professeurService;
          switch (choix) {
                case 1:
                System.out.println("Entrer le libellé");
                String libelle=sc.nextLine(); 
                Classe  cl=new Classe();
                    cl.setLibelle(libelle);
                    classeService.ajouterClasse(cl);
                break;
                case 2:
                List<Classe classes=  classeService.listerClasse();
                     for (Classe classe: classes ) {
                          System.out.println("Libelle "+ classe.getLibelle());
                          System.out.println("=================================");
                     }
                break;
                case 3:
                break ;
                case 4:
                System.out.println("Entrer le nom");
                String nom=sc.nextLine(); 
                System.out.println("Entrer le prénom");
                String prenom=sc.nextLine(); 
                System.out.println("Entrer le téléphone");
                int telephone=sc.nextInt(); 
                System.out.println("Entrer l'addresse");
                String addresse=sc.nextLine(); 
                Professeur  pr=new Professeur();
                 pr.setNom(nom);
                 pr.setPrenom(prenom);
                 pr.setTelephone(telephone);
                 pr.setAddresse(addresse);
                 professeurService.ajouterProfesseur(pr);
                break;
                case 5:
                break;
                case 6:
                List<Professeur professeurs=  professeurService.listerProfesseur();
                     for (Professeur professeur: professeur) {
                          System.out.println("Nom "+professeur.getNom());
                          System.out.println("Prénom "+professeur.getPrenom());
                          System.out.println("Telephone"+professeur.getTelephone());
                          System.out.println("Addresse "+professeur.getAddresse());
                          System.out.println("=================================");
                     }
                break;
                case 7:
                System.out.println("Entrer le téléphone");
                int telephonee=sc.nextInt(); 
                Inscription inscription= inscriptionService.listerInscription(telephone);
                     if (inscription!=null){
                         System.out.println("Entrer les frais");
                         Double tel=sc.nextDouble();  
                         System.out.println("Entrer la date");
                         int datee=sc.nextInt(); 
                    } else {
                         System.out.println("entrer le nom");
                         String nomm=sc.nextLine();
                         System.out.println("entrer le prénom");
                         String prnom=sc.nextLine();
                         System.out.println("Entrer le téléphone");
                         int telephnee=sc.nextInt(); 
                         System.out.println("Entrer la date");
                         int dateee=sc.nextInt(); 
                         System.out.println("Entrer les frais");
                         Double frais=sc.nextDouble(); 
                         Inscription  inscription=new Inscription();
                         inscription.setTelephone(telephnee);
                         inscription.setNom(nomm);
                         inscription.setPrenom(prenom);
                         inscription.setDateinscription(dateee);
                         inscription.setFrais(frais);
                         inscriptionService.ajouterInscription(inscription);
                              
                    } 
                    case 8:
                    List<Inscription inscriptions =  InscriptionService.listerInscription ();
                     for (Inscription inscription : Inscriptions) {
                          System.out.println("Téléphone "+ inscription.getTelephone());
                          System.out.println("NOM"+ inscription.getNom());
                          System.out.println("PRENOM "+ inscription.getPrenom());
                          System.out.println("DATE "+ inscription.getDateinscription());
                          System.out.println("FRAIS "+ inscription.getFrais());
                          System.out.println("=================================");
                     }

                    break ;
                    case 9:
                    










                break;
                } while (choix!=10)} ;



             }       
}
}
