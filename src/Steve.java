public class Steve extends CharacterBase implements Fighter{
    int ammo;
    public Steve(String name, int age, int hp, int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    public Steve(String name, int age, int hp, String idPrimaryKey, String faction, int level) {
        super(name, age, hp, idPrimaryKey, faction, level);
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
        return hp > 0;
    }

    @Override
    public String getIdPrimaryKey() {
        return "";
    }

    @Override
    public String getRole() {
        return "HERO";
    }

    @Override
    public String toString() {
        return "Steve{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", idPrimaryKey='" + idPrimaryKey + '\'' +
                ", faction='" + faction + '\'' +
                ", level=" + level +
                '}';
    }
}
