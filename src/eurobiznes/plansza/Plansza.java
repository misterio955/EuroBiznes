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
public class Plansza {

    String sciezka = "C:\\Users\\Basian\\Documents\\NetBeansProjects\\EuroBiznes\\src\\eurobiznes\\plansza\\Miasta";
    Pole[] plansza = new Pole[40];
    String first_read[] = null;

    public void uzupelnieniePlanszy() throws IOException {

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
        
        for(Pole pole:plansza){
         System.out.println(pole);
        }

    }
    
    public void ustawWlasciciela(Pole pobranePole, String wlasciciel){
      
      //plansza[index].setWlasciciel(wlasciciel);
        Pole pole = pobranePole;
        pole.setWlasciciel(wlasciciel);
        
    }

}
