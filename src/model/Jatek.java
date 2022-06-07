package model;

import java.util.Scanner;

public class Jatek {
    private static Scanner sc = new Scanner(System.in);
    private Lada[] ladak = new Lada[3];
    
    public Jatek(){
        jatekindit();
    }
    
    public void jatekindit(){
        ladak[0] = new Lada(Anyag.ARANY, "Én rejtem a kincset", false);
        ladak[1] = new Lada(Anyag.EZUST, "Nem én rejtem a kincset", true);
        ladak[2] = new Lada(Anyag.BRONZ, "Az arany hazudik", false);
        szovegkiir();
        System.out.print("Szerinted melyik ládában lehet a kincs: ");
        String valasz = sc.nextLine();

        if (valaszHelyes(valasz) == true) {
            System.out.println("Gratulálunk megtaláltad a kincset");
        }else{
            System.out.println("Sajnos nem találtad meg a kincset");
        }
    }
    public void szovegkiir(){
        System.out.println("Találos kérdés. Csak az egyik láda mond igazat.");
        System.out.printf("%s: %s \n%s: %s \n%s: %s\n", ladak[0].getAnyag(), ladak[0].getSzoveg(), ladak[1].getAnyag(), ladak[1].getSzoveg(), ladak[2].getAnyag(), ladak[2].getSzoveg());
    }
    
    public boolean valaszHelyes(String valasz){
        if (valasz.toUpperCase().equals("EZUST")) {
            return true;
        }else{
            return false;
        }
        
    }
}
