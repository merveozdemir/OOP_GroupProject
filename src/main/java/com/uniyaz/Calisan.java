package com.uniyaz;

public abstract class Calisan {
    private String isim;
    private String soyisim;
    private int calisanId;
    private String calistigiFirma;
    private float maas;
    private byte calistigiYilSayisi;
    private int idCounter;
    private String meslekAdi;



    public Calisan(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
        idCounter++;
        this.calisanId = idCounter;
    }
    boolean imzaYeklisiKontrol(){
        return getImzaYetkisi();
    }

    abstract  boolean getImzaYetkisi();

    abstract void isYap();

    protected float maasHesapla(){
        this.maas = getAsgariUcret()*getCalistigiYilSayisi();
        return maas;
     }

    abstract float getAsgariUcret();
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMeslekAdi() {
        return meslekAdi;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getCalisanId() {
        return calisanId;
    }

    public void setCalisanId(int calisanId) {
        this.calisanId = calisanId;
    }

    public String getCalistigiFirma() {
        return calistigiFirma;
    }

    public void setCalistigiFirma(String calistigiFirma) {
        this.calistigiFirma = calistigiFirma;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    public byte getCalistigiYilSayisi() {
        return calistigiYilSayisi;
    }

    public void setCalistigiYilSayisi(byte calistigiYilSayisi) {
        this.calistigiYilSayisi = calistigiYilSayisi;
    }
}
