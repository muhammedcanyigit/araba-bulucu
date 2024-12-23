public class Bilgi {
    private String ad;
    private float fiyat;
    private int model;


    public Bilgi(String ad, float fiyat, int model) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.model = model;
    }


    @Override
    public String toString() {
        return "araba: " + ad + " " + fiyat + " - " + model;
    }


    public float getFiyat() {
        return fiyat;
    }

    public String getAd() {
        return ad;
    }

    public int getModel() {
        return model;
    }
}
