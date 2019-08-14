package com.bablaskoding.wasisjayagorden;

import java.util.ArrayList;

public class GordenData {

    public static String[][] data = new String[][]{
            {
                "Navy Acc -  tirai jaring LILL",
                "Rp. 85.000",
                "https://s1.bukalapak.com/img/1724968943/s-194-194/2904449_2bf81eef_7f62_4564_b0c9_3c5bee43b134_500_343.jpg",
                "4.8/5.0"
            },
            {
                "Vitrase Polos Inner",
                "Rp 50.000",
                "https://s2.bukalapak.com/img/79885430031/s-194-194/Vitrase_polos_inner_dalaman_gorden_putih.png",
                    "4.7/5.0"
            },
            {
                "Gordyn Gorden Sakura",
                "Rp 115.000",
                "https://s3.bukalapak.com/img/8727922562/s-194-194/gordyn_gorden_sakura__gorden_tirai_gordenminimalis_blackout.jpg",
                    "4.9/5.0"
            },
            {
                "Gorden Blazer Hijla",
                "Rp 115.000",
                "https://s1.bukalapak.com/img/11664132221/s-194-194/Gorden_Blazer_Hijla.jpg",
                    "4.4/5.0"
            },
            {
                "Gorden Shabbychic Bunga Series",
                "Rp 145.000",
                "https://s1.bukalapak.com/img/1660315004/s-194-194/collage.jpg",
                    "4.5/5.0"
            },
            {
                "Gorden Blackout LPS",
                "Rp 125.000",
                "https://s2.bukalapak.com/img/7171913363/s-194-194/LapakGorden_Blackout_LPS____________________________________.jpg",
                    "4.8/5.0"
            },
            {
                "Gorden Gordyn Hordeng Polos",
                "Rp 115.000",
                "https://s1.bukalapak.com/img/14792670621/s-194-194/2019_07_30T14_12_15_07_00.jpg",
                    "4.7/5.0"
            },
            {
                "Shabbychic Neiroby Gorden Series",
                "Rp 145.000",
                "https://s1.bukalapak.com/img/1605552004/s-194-194/Shabbychic_Neiroby_GORDEN_Series.jpg",
                    "4.8/5.0"
            },
            {
                "Gorden Karakter",
                "Rp 16.500",
                "https://s2.bukalapak.com/img/70104465921/s-194-194/Gorden_Karakter___Gorden_Jendela____Tirai_Karakter___Gordyn_.jpg",
                    "4.3/5.0"
            },
            {
                "Gorden Ikat Shabby N2K",
                "Rp 55.000",
                "https://s3.bukalapak.com/img/8039395407/s-194-194/Gorden_ikat_Shabby_N2K.jpg",
                    "4.6/5.0"
            },
            {
                "Blackout Shabbychic Series",
                "Rp 135.000",
                "https://s4.bukalapak.com/img/9462818843/s-194-194/Blackout_shabbychic_series__gorden__gordyn__tirai.jpg",
                    "4.8/5.0"
            },
            {
                "Blazer Asoka",
                "Rp 115.000",
                "https://s4.bukalapak.com/img/9104530763/s-194-194/Blazer_Asoka.png",
                    "4.7/5.0"
            },
            {
                "Blackout Embosh Gorden",
                "Rp 95.000",
                "https://s3.bukalapak.com/img/3981615983/s-194-194/Blackout_Embos__Stok_jadi_gorden_gordyn_.png",
                    "4.9/5.0"
            },
            {
                "Gorden Beauty Motif Bunga",
                "Rp 125.000",
                "https://s1.bukalapak.com/img/66311285711/s-194-194/Gorden_Beauty_Motif_.png",
                    "5.0/5.0"
            },
            {
                "Gorden My Little Pony",
                "Rp 85.000",
                "https://s4.bukalapak.com/img/4387922063/s-194-194/Gorden_jendela_minimalis_kamar_anak_motif_may_litle_pony.jpg",
                    "4.8/5.0"
            }
    };

    public static ArrayList<Gorden> getListData(){
        ArrayList<Gorden> list = new ArrayList<>();
        for (String[] gData : data) {
            Gorden gorden = new Gorden();
            gorden.setType(gData[0]);
            gorden.setPrice(gData[1]);
            gorden.setPhoto(gData[2]);
            gorden.setRating(gData[3]);

            list.add(gorden);
        }

        return list;
    }
}
