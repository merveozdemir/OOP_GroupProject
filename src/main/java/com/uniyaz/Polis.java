package com.uniyaz;

public class Polis extends Calisan implements OfisteCalisabilir,SahadaCalisabilir{

    public Polis(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    boolean getImzaYetkisi() {
        return false;
    }

    @Override
    void isYap() {
        System.out.println("Huzur ve güven ortamı sağlandı");
    }

    @Override
    float getAsgariUcret() {
        return 2000;
    }


    @Override
    public void ofisteCalis() {

        System.out.println("Ofiste Çalışıyor");

    }

    @Override
    public void SahadaCalis() {

        System.out.println("Suçlular yakalandı");
    }
}