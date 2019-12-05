package com.uniyaz;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Mimar> Mimarlar = new ArrayList<>();

        Mimar calisan=new Mimar();
        calisan.setCalistigiFirma("Universal");
        calisan.setMaas(2600);
        calisan.setCalistigiYilSayisi((byte)4);

        Mimarlar.add(calisan);

        Mimar calisan2=new Mimar();
        calisan2.setCalistigiFirma("Akinon");
        calisan2.setMaas(3400);
        calisan2.setCalistigiYilSayisi((byte)7);

        Mimarlar.add(calisan2);

        for(Mimar mimarlar: Mimarlar){
            System.out.println(mimarlar.getCalistigiFirma()+"-"+mimarlar.getCalistigiYilSayisi()+"-"+mimarlar.maasHesapla());
        }

    }
}
