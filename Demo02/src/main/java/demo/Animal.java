package demo;

public abstract class Animal implements Actions{
    public int healthPoint;
    public int happiness;
    public int satiety;
    public int age;
    public int purity;

    public Animal(){
        healthPoint = 25;
        happiness = 5;
        satiety = 25;
        age = 0;
        purity = 0;
    }

    @Override
    public void toFeed() {

    }

    @Override
    public void toPlay() {

    }

    @Override
    public void toScold() {

    }

    @Override
    public void toStroke() {

    }

    @Override
    public void toWash() {

    }

    @Override
    public void toHeal() {

    }
}
