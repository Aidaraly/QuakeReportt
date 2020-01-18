package com.example.quakereportt;

public class EarthQuake {
    public String mMag;
    public String mPlace;
    public String mDate;

    public EarthQuake (String Mag, String Place, String Date){
        mMag= Mag ;
        mPlace= Place ;
        mDate = Date;

    }
    public String getmMag(){
            return mMag;
    }
    public String getmPlace(){
            return mPlace;
    }
    public String getmDate(){
            return mDate;
    }
}

