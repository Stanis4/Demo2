package demo;

public interface Actions {
    void toFeed() throws PetGrewUpException, PetDiedException;
    void toPlay();
    void toScold();
    void toStroke();
    void toWash();
    void toHeal();
}
