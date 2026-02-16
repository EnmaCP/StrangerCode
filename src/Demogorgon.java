public class Demogorgon extends CharacterBase implements Fighter {
    int ammo;
    public Demogorgon(String name, int age, int hp,int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    public Demogorgon(String name, int age, int hp, String idPrimaryKey, String faction, int level) {
        super(name, age, hp, idPrimaryKey, faction, level);
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

    @Override
    public String getIdPrimaryKey() {
        return "";
    }

    @Override
    public String getRole() {
        return "BOSS";
    }

    @Override
    public String toString() {
        return "Demogorgon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", idPrimaryKey='" + idPrimaryKey + '\'' +
                ", faction='" + faction + '\'' +
                ", level=" + level +
                '}';
    }
}
