/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes.plansza;


public abstract class Pole {
//
//    public Pole(String nazwa, int numerPola) {
//        this.nazwa = nazwa;
//        this.numerPola = numerPola;
//    }

     String nazwa;
   int numerPola;
   String wlasciciel=null;
   
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getNumerPola() {
        return numerPola;
    }

    public void setNumerPola(int numerPola) {
        this.numerPola = numerPola;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }
    
  
}


