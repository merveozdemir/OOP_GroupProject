package com.uniyaz;

public class InsaatIscisi extends Calisan implements SahadaCalisabilir {

    @Override
    public String getMeslekAdi() {
        return "(İnşaat İşçisi)";
    }

    public InsaatIscisi(String isim, String soyisim) {
        super(isim, soyisim);
    }

    @Override
    boolean getImzaYetkisi() {
        return false;
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
    public void SahadaCalis() {
        System.out.println("Şantiyede çalıştı.");
    }
}
