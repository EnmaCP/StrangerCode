public class Hopper extends CharacterBase implements Fighter{

    private int ammo;

    public Hopper(String name, int age, int hp, int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    public Hopper(String name, int age, int hp, String idPrimaryKey, String faction, int level) {
        super(name, age, hp, idPrimaryKey, faction, level);
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
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

    @Override
    public String getIdPrimaryKey() {
        return "";
    }

    @Override
    public String getRole() {
        return "SUPPORT";
    }

    @Override
    public String toString() {
        return "Hopper{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", idPrimaryKey='" + idPrimaryKey + '\'' +
                ", faction='" + faction + '\'' +
                ", level=" + level +
                '}';
    }
}
