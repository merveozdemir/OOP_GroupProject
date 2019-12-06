package com.uniyaz;

public class InsaatMuhendisi extends Muhendis implements SahadaCalisabilir{


    public InsaatMuhendisi(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    void isYap() {
        System.out.println("Bu bir inşaat mühendisi için yazılmıştır bu nedenle sahaya da gider");
    }

    @Override
    public void SahadaCalis() {

        System.out.println("Alemde ismimiz şantiyede resmimiz");

    }

    @Override
    float getAsgariUcret() {
        return 3500;
    }
}
