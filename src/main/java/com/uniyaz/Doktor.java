package com.uniyaz;

public class Doktor extends Calisan implements OfisteCalisma {


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
        System.out.println("doktor ofiste çalışır");
    }
}
