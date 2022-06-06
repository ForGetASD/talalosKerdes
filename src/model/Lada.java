package model;

public class Lada {
    private String anyag;
    private String szoveg;
    private boolean nalaVan;

    
    public Lada(String anyag, String szoveg){
        this(anyag, szoveg, false);
    }
    
    public Lada(String anyag, String szoveg, boolean nalaVan){
        this.anyag = anyag;
        this.szoveg = szoveg;
        this.nalaVan = nalaVan;
    }
}
