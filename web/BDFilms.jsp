<%-- 
    Document   : BDFilms
    Created on : 07.02.2017, 13:54:46
    Author     : Gringo
--%>

<%@page import="java.util.List"%>
<%@page import="classes.Film"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <title>Films Page</title>
    </head>
    <body class="bdf_body">
        <%
            if( session.getAttribute("ini") == null )
                response.sendRedirect("login.jsp");
            List<Film> films = (List)application.getAttribute("films");
        %>
        <h1>База <%= films.size() %> фильмов</h1>
        <table border="1" cellspacing="1" class="table_films">
            <thead>
                <tr>
                    <th>N</th>
                    <th>Название</th>
                    <th>Режиссер</th>
                    <th>Год выпуска</th>
                    <th>Бюджет</th>
                    <th>Страна</th>
                    <th>Компания</th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <th>Ко ли че ст во</th>
                    <th colspan="6"><%= films.size() %></th>
                </tr>
            </tfoot>
            <tbody>
                <%
                    for(Film film : films)
                    {%>
                    <tr>
                        <td width="20"><%= film.id %></td>
                        <td><%= film.movie_titles %></td>
                        <td><%= film.produser %></td>
                        <td><%= film.year_of_issue %></td>
                        <td><%= film.budjet %></td>
                        <td><%= film.manufacturer_country %></td>
                        <td width="200"><%= film.company_manufacturer %></td>
                    </tr>
                    <%}
                %>
            </tbody>
        </table>
    </body>
</html>
