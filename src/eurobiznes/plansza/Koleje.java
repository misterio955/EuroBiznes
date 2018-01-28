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
public class Koleje extends Pole {

    private int cena;
    private int postoj;
    private int postojPrzyDwoch;
    private int postojPrzyTrzech;
    private int postojPrzyCzterech;

    public Koleje() {
    }

    
    public Koleje(String nazwa) {
        this.nazwa = nazwa;
    }

    public void uzupelnieniePlanszyKolejami(Pole[] plansza) throws IOException {

        
        Koleje poludniowe = new Koleje("Południowe koleje");
        Koleje zachodnie = new Koleje("Zachodnie koleje");
        Koleje polnocne = new Koleje("Północne koleje");
        Koleje wschodnie = new Koleje("Wschodnie koleje");
        
        
        ArrayList<Koleje> koleje = new ArrayList<>(4);
        koleje.add(poludniowe);
        koleje.add(zachodnie);
        koleje.add(polnocne);
        koleje.add(wschodnie);

        int poleKoleji = 6;
        for (Koleje czescKoleje : koleje) {
            czescKoleje.setNumerPola(poleKoleji);
            czescKoleje.setWlasciciel(wlasciciel);
            czescKoleje.setNumerPola(poleKoleji);
            czescKoleje.setCena(400);
            czescKoleje.setPostoj(50);
            czescKoleje.setPostojPrzyDwoch(100);
            czescKoleje.setPostojPrzyTrzech(200);
            czescKoleje.setPostojPrzyCzterech(400);

            plansza[poleKoleji - 1] = czescKoleje;
            poleKoleji += 10;
        }
        
 

    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Override
    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public void setNumerPole(int numerPola) {
        this.numerPola = numerPola;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setPostoj(int postoj) {
        this.postoj = postoj;
    }

    public void setPostojPrzyDwoch(int postojPrzyDwoch) {
        this.postojPrzyDwoch = postojPrzyDwoch;
    }

    public void setPostojPrzyTrzech(int postojPrzyTrzech) {
        this.postojPrzyTrzech = postojPrzyTrzech;
    }

    public void setPostojPrzyCzterech(int postojPrzyCzterech) {
        this.postojPrzyCzterech = postojPrzyCzterech;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public int getCena() {
        return cena;
    }

    public int getPostoj() {
        return postoj;
    }

    public int getPostojPrzyDwoch() {
        return postojPrzyDwoch;
    }

    public int getPostojPrzyTrzech() {
        return postojPrzyTrzech;
    }

    public int getPostojPrzyCzterech() {
        return postojPrzyCzterech;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public int NumerPole() {
        return numerPola;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return getNazwa() + "{ numer pola= " + getNumerPola() + ", cena=" + getCena() + ", postoj=" + getPostoj() + ", postojPrzyDwoch=" + getPostojPrzyDwoch()
                + ", postojPrzyTrzech=" + getPostojPrzyTrzech() + ", postojPrzyCzterech=" + getPostojPrzyCzterech() + ", wlasciciel= " + getWlasciciel() + '}';
    }

}
