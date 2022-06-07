package test;

import model.Anyag;
import model.Lada;

public class jatekTest {
    public static void main(String[] args) {
        ladaEllenorzes();
    }
    
    public static void ladaEllenorzes(){
        Lada l1 = new Lada("teszt");
        assert l1.getAnyag() == Anyag.BRONZ;
        assert l1.getNalaVan() == false;
        System.out.println("Sikeres teszteset");
    }
}
