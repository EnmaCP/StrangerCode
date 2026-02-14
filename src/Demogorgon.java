public class Demogorgon extends CharacterBase implements Fighter {
    int ammo;
    public Demogorgon(String name, int age, int hp,int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    @Override
    public int attack() {
        return 19;
    }

    @Override
    public void battleCry() {
        System.out.println("Demogorgon: *SCREEECH*");
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}
