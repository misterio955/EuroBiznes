/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes.plansza;

import java.io.IOException;

/**
 *
 * @author Basian
 */
public class RoznePola extends Pole{
    
    
    
     public void uzupelnieniePlanszyRoznymi(Pole[] plansza) throws IOException {
     
      
        Koleje wodociagi = new Koleje("Elektrownia atomowa");
        Koleje elektrownia = new Koleje("Sieć wodociągów");
         
         
         
     }
    
    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public int getNumerPola() {
        return numerPola;
    }

    @Override
    public void setNumerPola(int numerPola) {
        this.numerPola = numerPola;
    }

    
    @Override
    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }
    
    
}
