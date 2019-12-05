package com.uniyaz;

public class Polis extends Calisan {



    @Override
    void isYap() {

    }

    @Override
    float maasHesapla() {
        float ucret = getAsgariUcret()*getCalistigiYilSayisi();
        this.setMaas(ucret);
        return ucret;
    }

    @Override
    float getAsgariUcret() {
        return 1000;
    }


}
