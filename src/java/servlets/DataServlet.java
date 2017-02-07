/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import classes.DBFilmsClass;
import classes.Film;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gringo
 */
public class DataServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        List<Film> films = new ArrayList<>();
        DBFilmsClass flms = new DBFilmsClass();
        films = flms.getFilms();
        
        ServletContext sc = config.getServletContext();
        sc.setAttribute("films", films);
    }
}
