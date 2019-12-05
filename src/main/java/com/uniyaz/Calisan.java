package com.uniyaz;

public abstract class Calisan {
    private String calistigiFirma;
    private float maas;
    private byte haftalikCalismaSaati;


    abstract void isYap();
    abstract float maasHesapla();

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

    public byte getHaftalikCalismaSaati() {
        return haftalikCalismaSaati;
    }

    public void setHaftalikCalismaSaati(byte haftalikCalismaSaati) {
        this.haftalikCalismaSaati = haftalikCalismaSaati;
    }
}
