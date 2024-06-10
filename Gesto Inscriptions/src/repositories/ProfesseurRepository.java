package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entities.Professeur;
public class ProfesseurRepository<Professeur> extends Database {
    private final  String SQL_SELECT_ALL="select * from professeur" ;
    private final  String SQL_INSERT="INSERT INTO `professeur` (`id, `nom`, `prenom`, `addresse`) VALUES (?,?,?,?)";
    public void insertBien(Professeur professeur){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setInt(1, professeur.getId());
                statement.setString(2, professeur.getNom());
                statement.setString(2, professeur.getPrenom());
                statement.setString(4, professeur.getAddresse());
                int nbreLigne=executeUpdate();
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public List<Professeur> getAllprofesseurs(){
            List<Professeur> professeurs=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
    
                     
                     Professeur professeur=new Professeur();
                     professeur.setId(rs.getInt("id_professeur"));
                     professeur.setNom(rs.getString("nom"));
                     professeur.setPrenom(rs.getString("prenom"));
                     professeur.setAddresse(rs.getString("addresse"));
                     professeur.setTelephone(rs.getInt(("telephone")));
                     professeurs.add(professeur);
             }
             rs.close();
            closeConnexion();
          }
          catch (SQLException e) {
              System.out.println("Erreur de Connexion à la BD");
         }
         return professeurs;
       }

}