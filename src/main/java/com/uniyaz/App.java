package com.uniyaz;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    static List<Calisan> calisanList = new ArrayList<>();
    public static void main( String[] args )
    {
        //Kaan
        ArrayList<Mimar> Mimarlar = new ArrayList<>();


        Mimar calisan=new Mimar("Fırat", "Ulgay");
        calisan.setCalistigiFirma("Universal");
      //  calisan.setMaas(2600);
        calisan.setCalistigiYilSayisi((byte) 4);

        Mimarlar.add(calisan);

        Mimar calisan2=new Mimar("Kaan", "Binat");
        calisan2.setCalistigiFirma("Akinon");
      //  calisan2.setMaas(3400);
        calisan2.setCalistigiYilSayisi((byte) 7);

        Mimarlar.add(calisan2);

        for(Mimar mimarlar: Mimarlar){
            System.out.println(mimarlar.getCalistigiFirma()+"-"+mimarlar.getCalistigiYilSayisi()+"-"+mimarlar.maasHesapla());
        }

        //Merve
        calisanList.add(calisan);
        calisanList.add(calisan2);

        InsaatIscisi insaatIscisi1 = new InsaatIscisi("Ali","Kara");
        insaatIscisi1.setCalistigiYilSayisi((byte)2);

        Muhendis muhendis1 = new Muhendis("merve", "özdemir");
        muhendis1.setCalistigiYilSayisi((byte)3);
        Muhendis muhendis2 = new Muhendis("firdevs", "korkut");
        muhendis2.setCalistigiYilSayisi((byte)2);

        Polis polis1 = new Polis("dilara", "eskin");
        polis1.setCalistigiYilSayisi((byte)5);

        Doktor doktor1 = new Doktor("Elif", "Çare");
        doktor1.setCalistigiYilSayisi((byte) 1);

        calisanList.add(muhendis1);
        calisanList.add(muhendis2);
        calisanList.add(polis1);
        calisanList.add(doktor1);




        //FIRAT

        Doktor doktor2 = new Doktor("Murat","Soyaslan");
        doktor2.setCalistigiYilSayisi((byte) 5);
        doktor2.setCalistigiFirma("Medical Park");

        Mimar mimar1 = new Mimar("Emin","Şahin");
        mimar1.setCalistigiYilSayisi((byte) 2);
        mimar1.setCalistigiFirma("Diba İnşaat");

        calisanList.add(mimar1);
        calisanList.add(doktor2);

        getCalisanMaaslari(calisanList);

        //DİLARA

        Muhendis muhendis=new InsaatMuhendisi("Dilara","Eşkin");
        muhendis.setCalistigiYilSayisi((byte)8);
        muhendis.setCalistigiFirma("Cengiz İnşaat");

        calisanList.add(muhendis);
        getImzaYetkileri(calisanList);
        getCalisanMaaslari(calisanList);

    }

        static void getCalisanMaaslari(List<Calisan> calisanList){
            System.out.println("-------Çalışanların maaş listesi-------");
            for (Calisan calisan: calisanList) {
                calisan.maasHesapla();
                System.out.println(calisan.getIsim() + " "  + calisan.getSoyisim() + ":  " + calisan.getMaas()+" "+ calisan.getMeslekAdi());
            }

        }
        static void getImzaYetkileri(List<Calisan> calisanList){
            System.out.println("-------Çalışanların imza yetki listesi-------");
            for (Calisan calisan: calisanList) {
                calisan.getImzaYetkisi();
                System.out.println(calisan.getIsim() + " "  + calisan.getSoyisim() + ": "+" İmza Yetkisi(" + calisan.getImzaYetkisi()+" )"+""+ calisan.getMeslekAdi());
            }

        }
}
