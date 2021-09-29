package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

         List<Bejegyzes> bejegyzesLista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Add meg, hogy hány bejegyzést szeretnél felvenni: ");
        int bejegyzesSzam = sc.nextInt();

        for(int i = 0; i < bejegyzesSzam+1; i++){
            System.out.print("Add meg a bejegyzést: ");

        }

        try {
            FileReader fr = new FileReader("bejegyzesek.txt");
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null){
                String[] adatok = sor.split(";");
                Bejegyzes bejegyzes = new Bejegyzes(adatok[0], adatok[1]);
                bejegyzesLista.add(bejegyzes);
                sor = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        Random rnd = new Random();
        int n = rnd.nextInt(bejegyzesSzam);
        n += 20;

    }

    }

