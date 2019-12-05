package com.uniyaz;

public abstract class Calisan {
    private String calistigiFirma;
    private float maas;
    private byte calistigiYilSayisi;



    abstract void isYap();
     float maasHesapla(){
         return getAsgariUcret()*getCalistigiYilSayisi();

     }

    abstract float getAsgariUcret();

    public String getCalistigiFirma() {
        return calistigiFirma;
    }

    public void setCalistigiFirma(String calistigiFirma) {
        this.calistigiFirma = calistigiFirma;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }


    public byte getCalistigiYilSayisi() {
        return calistigiYilSayisi;
    }

    public void setCalistigiYilSayisi(byte calistigiYilSayisi) {
        this.calistigiYilSayisi = calistigiYilSayisi;
    }



}
