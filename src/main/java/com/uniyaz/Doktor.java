package com.uniyaz;

public class Doktor extends Calisan implements OfisteCalisma {
    @Override
    public String getMeslekAdi() {
        return "(Doktor)";
    }

    public Doktor(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    void isYap() {
        System.out.println("Hasta muayene edildi");
    }


    @Override
    float getAsgariUcret() {
        return 2000;
    }

    @Override
    public void ofisteCalis() {
        System.out.println("doktor ofiste çalıştı");
    }
}
