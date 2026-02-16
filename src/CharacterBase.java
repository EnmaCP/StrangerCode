import java.util.Objects;
import java.util.UUID;

public abstract class CharacterBase implements Identificable {
    protected String name;
    protected int age;
    protected int hp;
    protected String idPrimaryKey;
    protected String faction;
    protected int level;

    public CharacterBase(String name, int age, int hp) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        //this.id = UUID.randomUUID().toString();
    }

    public CharacterBase(String name, int age, int hp, String idPrimaryKey, String faction, int level) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.idPrimaryKey = idPrimaryKey;
        this.faction = faction;
        this.level = level;
    }

    public void receiveDamage(int damage) {
        this.hp -= damage;
        if(hp < 0) {
            hp = 0;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CharacterBase that = (CharacterBase) o;
        return age == that.age && Objects.equals(name, that.name);
    }


    @Override
    public String toString() {
        return "CharacterBase{" +
                "name=" + name +
                ", age=" + age +
                ", hp=" + hp +
                '}';
    }
}
