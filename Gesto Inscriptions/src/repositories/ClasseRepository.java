package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Classe;

public class ClasseRepository extends Database{
    private static final Classe classes = null;
    private final  String SQL_SELECT_ALL="select * from classe" ;
        private final  String SQL_INSERT="INSERT INTO classe (libelle) VALUES (?)";
        //select
       public void insertZone(Classe classe){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setString(1, classe.getLibelle());
                int nbreLigne=executeUpdate();
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public List<Classe getAllClasses(){
            List<Classe> classes=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
                  Classe classe=new Classe();
                  classe.setLibelle(rs.getString("libelle"));
                classes.add(classe);
             }
             rs.close();
           closeConnexion();
        }
         catch (SQLException e) {
              System.out.println("Erreur de Connexion à la BD");
        }
        return classes;
       }

}