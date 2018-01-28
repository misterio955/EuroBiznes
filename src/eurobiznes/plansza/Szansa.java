/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes.plansza;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Basian
 */
public class Szansa extends Pole {

    private boolean czyNiebieski;

    public Szansa() {
    }
    
    public Szansa(String nazwa, boolean czyNiebieski) {
        this.nazwa = nazwa;
         this.czyNiebieski= czyNiebieski;
    }

    public void uzupelnieniePlanszySzansami(Pole[] plansza) throws IOException {
        
        Szansa niebieska1 = new Szansa("Szansa (niebieska karta)",true);
        Szansa niebieska2 = new Szansa("Szansa (niebieska karta)",true);
        Szansa niebieska3 = new Szansa("Szansa (niebieska karta)",true);
        Szansa czerwona1 = new Szansa("Szansa (czerwona karta)",false);
        Szansa czerwona2 = new Szansa("Szansa (czerwona karta)",false);
        Szansa czerwona3 = new Szansa("Szansa (czerwona karta)",false);
        
        niebieska1.setNumerPola(3);
        czerwona1.setNumerPola(8);
        niebieska2.setNumerPola(18);
        czerwona2.setNumerPola(23);
        niebieska3.setNumerPola(34);
        czerwona3.setNumerPola(37);
        
        plansza[niebieska1.getNumerPola()-1]=niebieska1;
        plansza[niebieska2.getNumerPola()-1]=niebieska2;
        plansza[niebieska3.getNumerPola()-1]=niebieska3;
        plansza[czerwona1.getNumerPola()-1]=czerwona1;
        plansza[czerwona2.getNumerPola()-1]=czerwona2;
        plansza[czerwona3.getNumerPola()-1]=czerwona3;
       
    }

    public boolean getCzyNiebieski() {
        if (true){
        return czyNiebieski;
        }
        else return !czyNiebieski;   
        
    }

    @Override
    public String getNazwa() {
        return nazwa;
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
    public String toString() {
        return getNazwa() + "{ numer pola= " + getNumerPola() + ", czyNiebieska = " +getCzyNiebieski()+'}';
    }
    
}
