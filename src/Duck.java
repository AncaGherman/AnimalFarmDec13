public class Duck extends Animal {
    @Override
    void sound() {
        System.out.println("macaie rata");
        SoundOfAnimals.soundOfAnimal("duck.mp3");
    }
    @Override
    public void move() {
        System.out.println("asta e ratza, se misca cu totul altfel ");
    }
}
