package com.uniyaz;

public class Muhendis extends Calisan implements OfisteCalisabilir{


    public Muhendis(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    boolean getImzaYetkisi() {
        System.out.println("İmza yetkileri vardır");
        return true;
    }

    @Override
    void isYap() {
        System.out.println("Genel mühendisler içindir.");
    }

    @Override
    float getAsgariUcret() {
        return 3000;
    }


    @Override
    public void ofisteCalis() {

    }
}
