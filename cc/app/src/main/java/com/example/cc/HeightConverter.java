package com.example.cc;

public class HeightConverter {
    public static double CemFeet(double CmFt){
        CmFt=CmFt/30.48;
        return CmFt;
    }

    public static double FeetInch(double FtIn)
    {
        FtIn=FtIn*12;
        return FtIn;
    }

    public static  double FeetCem(double FtCm)
    {
        FtCm=FtCm*30.48;
        return FtCm;
    }
}
