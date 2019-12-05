package com.uniyaz;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class InsaatIscisi extends Calisan implements SantiyedeCalisma {


    public InsaatIscisi(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    float getAsgariUcret() {
        return 1000;
    }

    @Override
    void isYap() {
        System.out.println("İnşaat işleri yapıldı.");
    }

    @Override
    public void santiyedeCalis() {
        System.out.println("Şantiyede çalıştı.");
    }
}
