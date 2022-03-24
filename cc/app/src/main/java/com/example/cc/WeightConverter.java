package com.example.cc;

public class WeightConverter {
    public static double PndKg(double PdKg){
        PdKg=PdKg*0.453;
        return PdKg;
    }

    public static double KgPnd(double KgPd)
    {
        KgPd=KgPd*2.20;
        return KgPd;
    }

    public static  double KgOnc(double KgOn)
    {
        KgOn=KgOn*35.27;
        return KgOn;
    }
    public static  double KgGrm(double KgGr)
    {
        KgGr=KgGr*1000;
        return KgGr;
    }
}
