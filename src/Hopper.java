public class Hopper extends CharacterBase implements Fighter{

    private int ammo;

    public Hopper(String name, int age, int hp, int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public String toString() {
        return "Hopper{" +
                "ammo=" + ammo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hp=" + hp +
                '}';
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public void battleCry() {
        System.out.println("Hopper: Stay behind me");
    }

    @Override
    public boolean isAlive() {
        return hp > 0 ;
    }
}
