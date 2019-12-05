package com.uniyaz;

public class Mimar extends Calisan implements OfisteCalisma {

    @Override
    public String getMeslekAdi() {
        return "(Mimar)";
    }

    public Mimar(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    public String getCalistigiFirma() {
        return super.getCalistigiFirma();
    }

    @Override
    public void setCalistigiFirma(String calistigiFirma) {
        super.setCalistigiFirma(calistigiFirma);
    }

    @Override
    public void setMaas(float maas) {
        super.setMaas(maas);
    }

    @Override
    public float getMaas() {
        return super.getMaas();
    }

    @Override
    float getAsgariUcret() {
        return 3000;
    }

    @Override
    void isYap() {
        System.out.println("Evin Mimari Deseni Çizildi");
    }

    @Override
    public void ofisteCalis() {
        System.out.println("Ofiste Çalışıyor");
    }

    @Override
    public void setCalistigiYilSayisi(byte calistigiYilSayisi) {
        super.setCalistigiYilSayisi(calistigiYilSayisi);
    }

    @Override
    public byte getCalistigiYilSayisi() {
        return super.getCalistigiYilSayisi();
    }
}
