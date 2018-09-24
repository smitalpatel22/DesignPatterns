package com.practice.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable
{
    private List<IObserver> observers;
    private int currentTemperature;

    public WeatherStation ()
    {
        this.observers = new ArrayList<>();
        currentTemperature = 5;
    }

    @Override
    public void addObserver (IObserver observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver (IObserver observer)
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver ()
    {
        for(IObserver observer : observers)
        {
            observer.update();      //incase of push mechanism, here we will pass the changed data as the argument
        }
    }

    //getState() method required incase of Observer.pull() mechanism
    public int getTemperature()
    {
        return currentTemperature = currentTemperature +5;
    }
}
