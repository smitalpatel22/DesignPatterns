package com.practice.ObserverPattern;

public class ObserverRunner
{
    public static void main (String[] args)
    {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        WindowDisplay windowDisplay = new WindowDisplay(station);

        station.addObserver(phoneDisplay);

        station.addObserver(windowDisplay);
        station.notifyObserver();

    }



}
