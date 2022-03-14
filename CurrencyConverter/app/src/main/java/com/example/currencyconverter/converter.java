package com.example.currencyconverter;

public class converter {

    public static double UsdBDT(double usdB){
        usdB=usdB*80;
        return usdB;
    }

    public static double bdtUSD(double BDTu)
    {
        BDTu=BDTu/80;
        return BDTu;
    }

    public static  double bdtI(double BDTI)
    {
        BDTI=BDTI*78;
        return BDTI;
    }
}