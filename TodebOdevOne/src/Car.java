import java.awt.*;
import java.util.Date;

public final class Car {

    private Models models;
    private Date uretimTarihi;
    private int cikisYili;
    private int kilometre;
    private Color renk;
    private int kacKisilik;

    public Models getModels() {
        return models;
    }

    public void setModels(Models models) {
        this.models = models;
    }

    public Date getUretimTarihi() {
        return uretimTarihi;
    }

    public void setUretimTarihi(Date uretimTarihi) {
        this.uretimTarihi = uretimTarihi;
    }

    public int getCikisYili() {
        return cikisYili;
    }

    public void setCikisYili(int cikisYili) {
        this.cikisYili = cikisYili;
    }

    public int getKilometre() {
        return kilometre;
    }

    public void setKilometre(int kilometre) {
        this.kilometre = kilometre;
    }

    public Color getRenk() {
        return renk;
    }

    public void setRenk(Color renk) {
        this.renk = renk;
    }

    public int getKacKisilik() {
        return kacKisilik;
    }

    public void setKacKisilik(int kacKisilik) {
        this.kacKisilik = kacKisilik;
    }

    @Override
    public String toString() {
        return "Car{" +
                "models=" + models +
                ", uretimTarihi=" + uretimTarihi +
                ", cikisYili=" + cikisYili +
                ", kilometre=" + kilometre +
                ", renk=" + renk +
                ", kacKisilik=" + kacKisilik +
                '}';
    }
}
