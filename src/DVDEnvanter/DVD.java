
import java.util.ArrayList;

public class DVD {
    
    private String adSoyad;
    private String dvdBasligi;
    private int cikisTarihi;
    private int fiyatBilgisi;
   
    ArrayList<String> sarkiIsimleri = new ArrayList<>();
    
    public DVD(String adSoyad, String dvdBasligi, int cikisTarihi, int fiyatBilgisi) 
    {
        this.adSoyad = adSoyad;
        this.dvdBasligi = dvdBasligi;
        this.cikisTarihi = cikisTarihi;
        this.fiyatBilgisi = fiyatBilgisi;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getDvdBasligi() {
        return dvdBasligi;
    }

    public int getCikisTarihi() {
        return cikisTarihi;
    }

    public int getFiyatBilgisi() {
        return fiyatBilgisi;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setDvdBasligi(String dvdBasligi) {
        this.dvdBasligi = dvdBasligi;
    }

    public void setCikisTarihi(int cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }

    public void setFiyatBilgisi(int fiyatBilgisi) {
        this.fiyatBilgisi = fiyatBilgisi;
    }
    
    
}
