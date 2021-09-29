package hu.petrik;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Bejegyzes {
    private String szerzo;
    private  String tartalom;
    private  int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;



    public Bejegyzes(){
        likeok = 0;
        letrejott = LocalDateTime.now();
        szerkesztve = LocalDateTime.now();

    }
    public Bejegyzes(String szerzo, String tartalom, int likeok, LocalDateTime letrejott, LocalDateTime szerkesztve){
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = likeok;
        this.letrejott = letrejott;
        this.szerkesztve = szerkesztve;




    }



    public String getSzerzo(){
        return this.szerzo;
    }

    public String getTartalom() {
        return this.tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public int getLikeok() {
        return this.likeok;
    }

    public LocalDateTime getLetrejott() {

        return this.letrejott;
    }

    public LocalDateTime getSzerkesztve() {

        return this.szerkesztve;
    }

    public void like(){

        likeok++;
    }

    @Override
    public String toString() {
        return  szerzo + " - " + likeok + letrejott + "\nSzerkesztve: " + szerkesztve + "\n" + tartalom;
    }
}
