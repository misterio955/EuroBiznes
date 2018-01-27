/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes.plansza;

/**
 *
 * @author Basian
 */
public class Miasto extends Pole {

    String kraj;
    int cena;
    int postoj;
    int postoj1dom;
    int postoj2dom;
    int postoj3dom;
    int postojHotel;
    

//    public Miasto(int numerPola, String nazwa, int cena, int postoj, int postoj1dom, int postoj2dom, int postoj3dom, int postojHotel) {
//        super(nazwa, numerPola);
//        this.cena = cena;
//        this.postoj = postoj;
//        this.postoj1dom = postoj1dom;
//        this.postoj2dom = postoj2dom;
//        this.postoj3dom = postoj3dom;
//        this.postojHotel = postojHotel;
//    }
    @Override
    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public void setPostoj(int postoj) {
        this.postoj = postoj;
    }

    public void setPostoj1dom(int postoj1dom) {
        this.postoj1dom = postoj1dom;
    }

    public void setPostoj2dom(int postoj2dom) {
        this.postoj2dom = postoj2dom;
    }

    public void setPostoj3dom(int postoj3dom) {
        this.postoj3dom = postoj3dom;
    }

    public void setPostojHotel(int postojHotel) {
        this.postojHotel = postojHotel;
    }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String getWlasciciel() {
        return wlasciciel;
    }

    public String getKraj() {
        return kraj;
    }

    public int getCena() {
        return cena;
    }

    public int getPostoj() {
        return postoj;
    }

    public int getPostoj1dom() {
        return postoj1dom;
    }

    public int getPostoj2dom() {
        return postoj2dom;
    }

    public int getPostoj3dom() {
        return postoj3dom;
    }

    public int getPostojHotel() {
        return postojHotel;
    }

    @Override
    public String toString() {
        return getNazwa() + "{ Kraj = " + getKraj() +", numer pola= " + getNumerPola() + ", cena= " + getCena() + ", postoj= " + getPostoj() + ", postoj1dom= " + getPostoj1dom()
                + ", postoj2dom= " + getPostoj2dom() + ", postoj3dom= " + getPostoj3dom() + ", postojHotel= " + getPostojHotel() + ", wlasciciel= " + getWlasciciel() + '}';
    }

  

}
