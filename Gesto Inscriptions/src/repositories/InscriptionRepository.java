package repositories;

import java.sql.SQLException;

import entities.Inscription;
import entities.Professeur;

public class InscriptionRepository extends Database {
     private final  String SQL_INSERT="INSERT INTO `inscription` (`dateinscription', `frais`, `nom`, `prenom`,'telephone') VALUES (?,?,?,?,?)";
    public void insertBien(Inscription inscription){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setDate(1, inscription.getDateinscription());
                statement.setDouble(2, inscription.getFrais());
                statement.setString(2, inscription.getNom());
                statement.setString(4, inscription.getPrenom());
                statement.setInt(4, inscription.getTelephone());
                int nbreLigne=executeUpdate();
            closeConnexion();
             } catch (SQLException e) {
            e.printStackTrace();
            }

}
}