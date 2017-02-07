/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.math.BigDecimal;

/**
 *
 * @author Gringo
 */
public class Film {
    public int id;
    public String movie_titles;
    public String produser;
    public int year_of_issue;
    public BigDecimal budjet;
    public String manufacturer_country;
    public String company_manufacturer;

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s",
                id+"", movie_titles,produser,year_of_issue+"",budjet+"",
                manufacturer_country,company_manufacturer);
    }    
}
