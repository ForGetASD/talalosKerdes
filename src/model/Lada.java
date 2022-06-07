package model;

public class Lada {
    private Anyag anyag;
    private String szoveg;
    private boolean nalaVan;

    
    public Lada(String szoveg){
        this(Anyag.BRONZ, szoveg, false);
    }
    
    public Lada(Anyag anyag, String szoveg){
        this(anyag, szoveg, false);
    }
    
    public Lada(Anyag anyag, String szoveg, boolean nalaVan){
        this.anyag = anyag;
        this.szoveg = szoveg;
        this.nalaVan = nalaVan;
    }
    
    public Anyag getAnyag(){
        return anyag;
    }
    
    public String getSzoveg(){
        return szoveg;
    }
    
    public boolean getNalaVan(){
        return nalaVan;
    }
    
    public void setAnyag(Anyag anyag){
        this.anyag = anyag;
    }
    
    public void setSzoveg(String szoveg){
        this.szoveg = szoveg;
    }
    
    public void setNalaVan(boolean nalaVan){
        this.nalaVan = nalaVan;
    }
}
