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
public class Plansza {

    String sciezka = "C:\\Users\\Basian\\Documents\\NetBeansProjects\\EuroBiznes\\src\\eurobiznes\\plansza\\Miasta";
    Pole[] plansza = new Pole[40];
    String first_read[] = null;
    Miasto miasto = new Miasto();
    Koleje koleje = new Koleje();
    Szansa szansa = new Szansa();
    
    public void uzupelnieniePlanszy() throws IOException{
    miasto.uzupelnieniePlanszyMiastami(plansza,sciezka); 
    koleje.uzupelnieniePlanszyKolejami(plansza);
    szansa.uzupelnieniePlanszySzansami(plansza);
    }

    public void ustawWlasciciela(int index, String wlasciciel){
      plansza[index-1].setWlasciciel(wlasciciel);
      for (Pole pole : plansza) {
            System.out.println(pole);
        }
    }

}
