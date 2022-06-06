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
    
    public String getAnyag(){
        return anyag;
    }
    
    public String getSzoveg(){
        return szoveg;
    }
    
    public boolean getNalaVan(){
        return nalaVan;
    }
    
    public void setAnyag(String anyag){
        this.anyag = anyag;
    }
    
    public void setSzoveg(String szoveg){
        this.szoveg = szoveg;
    }
    
    public void setNalaVan(boolean nalaVan){
        this.nalaVan = nalaVan;
    }
}
