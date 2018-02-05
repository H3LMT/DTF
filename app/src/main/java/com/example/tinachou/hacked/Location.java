package com.example.tinachou.hacked;

public class Location {
    private String name;
    private boolean quiet;
    private boolean outdoors;
    private boolean wifi;
    private boolean printer;
    private boolean food;
    private double lat;
    private double longi;

    public Location(){
        name = "";
        quiet = false;
        outdoors = false;
        wifi = false;
        printer = false;
        food = false;
        food = false;
        lat = 0.0;
        longi = 0.0;
    }

    public Location(String s, boolean q, boolean nature, boolean modern, boolean print, boolean yum, double wide, double high){
        name = s;
        quiet = q;
        outdoors = nature;
        wifi = modern;
        printer = print;
        food = yum;
        lat = wide;
        longi = high;
    }
    public String getName()
    {
      return this.name;
    }

    public boolean getQuiet(){
        return this.quiet;
    }

    public boolean getPlace() {
        return this.outdoors;
    }
    public boolean getWifi(){
        return this.wifi;
    }

    public boolean getPrinter(){
        return this.printer;
    }

    public boolean getFood(){
        return this.food;
    }

    public double getLat(){
        return this.lat;
    }

    public double getLongi(){
        return this.longi;
    }
}