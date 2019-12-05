package com.uniyaz;

public class Muhendis extends Calisan implements OfisteCalisma {
    @Override
    public String getMeslekAdi() {
        return "(Mühendis)";
    }

    public Muhendis(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    void isYap() {
        System.out.println("");
    }

    @Override
    float getAsgariUcret() {
        return 3000;
    }

    @Override
    public void ofisteCalis() {

    }
}
