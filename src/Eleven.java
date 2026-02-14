public class Eleven extends CharacterBase implements Fighter {
    int ammo;
    public Eleven(String name, int age, int hp, int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    public void useTelekinesis(){
        System.out.println("Eleven uses telekinesis!");
    }

    @Override
    public int attack() {
        return 18;
    }

    @Override
    public void battleCry() {
        System.out.println("Eleven: I can do it");
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return "Eleven{" +
                "ammo=" + ammo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hp=" + hp +
                '}';
    }
}
