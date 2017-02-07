/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gringo
 */
public class DBFilmsClass {
    static{
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBFilmsClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Film> getFilms()
    {
        List<Film> films = new ArrayList<>();
        Connection connection = null;
        Statement stn = null;
        ResultSet resultSet = null;
        try {
            
            connection = DriverManager.getConnection("jdbc:sqlite:I:\\Java\\WebData_one\\TestFilms.db");
            stn = connection.createStatement();
            resultSet = stn.executeQuery("SELECT * FROM Films");
            while(resultSet.next())
            {
                Film film = new Film();
                film.id = resultSet.getInt(1);
                film.movie_titles = resultSet.getString(2);
                film.produser = resultSet.getString(3);
                film.year_of_issue = resultSet.getInt(4);
                film.budjet = resultSet.getBigDecimal(5);
                film.manufacturer_country = resultSet.getString(6);
                film.company_manufacturer = resultSet.getString(7);
                films.add(film);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBFilmsClass.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                connection.close();
                resultSet.getStatement().close();
            } catch (SQLException ex) {
                Logger.getLogger(DBFilmsClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return films;
    }
}
