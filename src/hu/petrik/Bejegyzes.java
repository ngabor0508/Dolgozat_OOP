package hu.petrik;

import java.time.LocalDateTime;
import java.util.Date;

public class Bejegyzes {
    private String szerzo;
    private  String tartalom;
    private  int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom){
        likeok = 0;
        letrejott = LocalDateTime.now();
        szerkesztve = LocalDateTime.now();

    }

    public String getSzerzo(){
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like(){
        likeok++;
    }

    @Override
    public String toString() {
        return  szerzo + " - " + likeok + letrejott + "\nSzerkesztve: " + szerkesztve + "\n" + tartalom;
    }
}
