package com.uniyaz;

public class Doktor extends Calisan implements OfisteCalisabilme{



    @Override
    void isYap() {
        System.out.println("Hasta muayene edildi");
    }

    @Override
    float maasHesapla() {
        float ucret = getAsgariUcret()*getCalistigiYilSayisi();
        this.setMaas(ucret);
        return ucret;
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
