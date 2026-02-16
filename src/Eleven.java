public class Eleven extends CharacterBase implements Fighter {
    int ammo;
    public Eleven(String name, int age, int hp, int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    public Eleven(String name, int age, int hp, String idPrimaryKey, String faction, int level) {
        super(name, age, hp, idPrimaryKey, faction, level);
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
        return hp > 0;
    }

    @Override
    public String toString() {
        return "Eleven{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", idPrimaryKey='" + idPrimaryKey + '\'' +
                ", faction='" + faction + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public String getIdPrimaryKey() {
        return "";
    }

    @Override
    public String getRole() {
        return "HERO";
    }
}
