/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes.plansza;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Basian
 */
public class Miasto extends Pole {

    private String kraj;
    private int cena;
    private int postoj;
    private int postoj1dom;
    private int postoj2dom;
    private int postoj3dom;
    private int postojHotel;
  
public void uzupelnieniePlanszyMiastami(Pole [] plansza, String sciezka) throws IOException {

    String first_read[] = null;
    
        try (FileReader filereader = new FileReader(sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {
                Miasto miasto = new Miasto();
                first_read = textLine.split(",");
                miasto.setNumerPola(Integer.valueOf(first_read[0]));
                miasto.setNazwa(first_read[1]);
                miasto.setCena(Integer.valueOf(first_read[2]));
                miasto.setPostoj(Integer.valueOf(first_read[3]));
                miasto.setPostoj1dom(Integer.valueOf(first_read[4]));
                miasto.setPostoj2dom(Integer.valueOf(first_read[5]));
                miasto.setPostoj3dom(Integer.valueOf(first_read[6]));
                miasto.setPostojHotel(Integer.valueOf(first_read[7]));
                miasto.setKraj(first_read[8]);
                plansza[Integer.valueOf(first_read[0]) - 1] = miasto;

                textLine = buffReader.readLine();
            } while (textLine != null);
        } catch (FileNotFoundException e) {

            System.err.println("Brak odpowiedniej scieżki pliku");
            System.exit(1);
        }
        
//        for(Pole pole:plansza){
//         System.out.println(pole);
//        }

    }

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
