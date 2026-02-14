public abstract class CharacterBase {
    protected String name;
    protected int age;
    protected int hp;

    public CharacterBase(String name, int age, int hp) {
        this.name = name;
        this.age = age;
        this.hp = hp;
    }
    public void receiveDamage(int damage) {
        if (damage < hp) {
            this.hp -= damage;
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
    public String toString() {
        return "CharacterBase{" +
                "name=" + name +
                ", age=" + age +
                ", hp=" + hp +
                '}';
    }
}
