public class Steve extends CharacterBase implements Fighter{
    int ammo;
    public Steve(String name, int age, int hp, int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    public void swingsBat(){
        System.out.println("Steve swings the bat!");
    }

    @Override
    public int attack() {
        return 11;
    }

    @Override
    public void battleCry() {
        System.out.println("Steve: Harrington's got this");
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
