/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes;

import eurobiznes.plansza.Plansza;

/**
 *
 * @author Basian
 */
public class Gracz {
    
    int AktualnePole=1;
    Plansza pla = new Plansza();
    int budzet=3000;
    int DniWiezienia=0;
    
    public int getAktualnePole() {
        return AktualnePole;
    }

    public void setAktualnePole(int AktualnePole) {
        this.AktualnePole = AktualnePole;
    }
  
}
