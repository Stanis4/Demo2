package demo;


public abstract class Animal implements Actions {
    public int getMAX_AGE() {
        return MAX_AGE;
    }

    private static final int MAX_AGE = 5;

    public int getMIN_HEALTH_POINT() {
        return MIN_HEALTH_POINT;
    }

    private static final int MIN_HEALTH_POINT = 0;

    public int healthPoint;
    public int happiness;
    public int satiety;
    public double age;
    public int purity;
    public boolean isItSick;


    public Animal() {
        healthPoint = 25;
        happiness = 5;
        satiety = 25;
        age = 0;
        purity = 0;
        isItSick = false;
    }

    @Override
    public void toFeed() {
        this.healthPoint += 2;
        this.happiness += 1;
        this.satiety += 10;
        this.age += 0.2;
        this.purity -= 2;
        this.check_stage(); //have to be static...

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

    public void check_stage() throws PetDiedException,PetGrewUpException {
        try {
            if (this.healthPoint <= MIN_HEALTH_POINT) {
                throw new PetDiedException("Your pet is dead. Game over.");
            }
            if (this.age<= MAX_AGE){
                throw new PetGrewUpException("Congratulations! Your pet has been grew up! \n Game over.");
            }
        } catch (PetDiedException e) {

        } catch (PetGrewUpException e) {

        }
    }


}
