package com.practice.ObserverPattern;

public class WindowDisplay implements IObserver, IDisplay
{
    private WeatherStation observable;      //needed in case of Pull Mechanism

    public WindowDisplay (WeatherStation observable)
    {
        this.observable = observable;
    }

    /**
     As we have implemented a Pull Mechanism, where the observer pulls Changed data,
     this method does not have any arguments.
     If we want to design Push mechanism, we will add a argument in which the Observable will push the changes.
     And in case of Push, above reference to Observable is not needed.
     */
    @Override
    public void update ()
    {
        System.out.println("Current Temperature updated");
        System.out.println("Calling Display of WindowDisplay");
        int temperature = observable.getTemperature();
        display(temperature);
    }

    @Override
    public void display (int temperature)
    {
        System.out.println("Current Temperature is : "+temperature+" Degree Celcius");
    }
}
