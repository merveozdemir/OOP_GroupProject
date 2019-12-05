package com.uniyaz;

public class Polis extends Calisan {


    public Polis(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    void isYap() {

    }

    @Override
    float getAsgariUcret() {
        return 2000;
    }


}
