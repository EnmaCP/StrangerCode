import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*ArrayList<Fighter> party = new ArrayList<>();
        party.add(new Eleven("Eleven",14,40,80));
        party.add(new Steve("Steve",17,45,60));
        party.add(new Hopper("Hopper",42,60,90));
        party.add(new Demogorgon("Demogorgon",0,70,70));

        for (Fighter fighter : party) {
            fighter.battleCry();
        }

        Demogorgon d = new Demogorgon("Demogorgon",0,70,70);
        System.out.println("HP = " + d.getHp());
        d.receiveDamage(15);
        System.out.println("HP = " + d.getHp());

        Fighter a = new Eleven("Eleven",14,40,80);
        Fighter b = new Steve("Steve",17,45,60);
        System.out.println(a.getName() + " dmg = "+a.attack());
        System.out.println(b.getName() + " dmg = "+b.attack());
        
        ArrayList<Fighter> fighters = new ArrayList<>();
        fighters.add(new Eleven("Eleven",14,40,80));
        fighters.add(new Steve("Steve",17,45,60));
        fighters.add(new Hopper("Hopper",42,60,90));
        
        for(Fighter f: fighters){
            if (f instanceof Eleven){
                /// HACEMOS CASTING EN INSTANCE OF PARA CONVERTIRNOS EN ELLA
                ((Eleven) f).useTelekinesis();
            }else if (f instanceof Steve){
                /// HACEMOS CASTING
                ((Steve)f).swingsBat();
            }
        }

        Hopper h = new Hopper("Hopper",42,60,90);
        h.receiveDamage(60);
        System.out.println("Alive =" + h.isAlive());

        Hopper h1 = new Hopper("Hopper",42,60,90);
        Hopper h2 = new Hopper("Hopper",42,10,20);
        System.out.println("Equals ="+ h1.equals(h2));

        Demogorgon boss = new Demogorgon("Demogorgon",0,70,70);
        ArrayList<Fighter> newParty = new ArrayList<>();
        newParty.add(new Eleven("Eleven", 14, 40, 80));
        newParty.add(new Steve("Steve", 17, 45, 60));
        newParty.add(new Hopper("Hopper", 42, 60, 90));

        while(boss.isAlive()){ //bucle mientras el boss esta vivo
            for(Fighter f: newParty){
                int dmg = f.attack();
                boss.receiveDamage(dmg);
                System.out.println(f.getName() + " hits boss dmg = "+dmg+" hp boss = " +boss.getHp());

                if(!boss.isAlive()){
                    System.out.println("Portal closed!");
                    break;
                }
            }
        }*/

        /*HashMap<String,CharacterBase> ordPerso = new HashMap<>(); //lista doble
        ArrayList<CharacterBase> lstSencilla = new ArrayList<>(); //lista sencilla

        Eleven elevenHashMap = new Eleven("Eleven",14,40,80);
        Steve steveHashMap = new Steve("Steve",17,45,60);
        Hopper hopperHashMap = new Hopper("Hopper",42,60,90);

        //ordPerso.put(elevenHashMap.earnIdPrimaryKey(), elevenHashMap);
        //ordPerso.put(steveHashMap.earnIdPrimaryKey(), steveHashMap);
        //ordPerso.put(hopperHashMap.earnIdPrimaryKey(), hopperHashMap);

        // Usamos lstSencilla para evitar advertencias y demostrar su uso
        lstSencilla.add(elevenHashMap);
        System.out.println("lstSencilla size = " + lstSencilla.size());

        // Consultamos ordPerso (imprimimos claves) para evitar la advertencia de 'actualizado pero nunca consultado'
        System.out.println("ordPerso keys: " + ordPerso.keySet());*/


        Eleven eleven = new Eleven("Eleven", 14,  80,"132432T", "Hawkins",30);
        System.out.println(eleven + " rol: " + eleven.getRole());
        Hopper hopper = new Hopper("Hopper", 42, 90, "57898P", "Police", 60);
        System.out.println(hopper + " rol: " +hopper.getRole());
        Steve steve = new Steve("Steve", 15, 50, "384789J", "Hawkins", 30);

        ArrayList<Fighter> heros = new ArrayList<>();
        heros.add(eleven);
        heros.add(hopper);
        heros.add(steve);

        for(Fighter f: heros){
            CharacterBase personaje = (CharacterBase)f;
            System.out.println(f.getName() + " " + f.attack() + " "+ ((CharacterBase) f).getRole());

        }

        for(Fighter f: heros){
            CharacterBase personaje = (CharacterBase)f;
            f.battleCry();
            if( f instanceof Eleven){
                ((Eleven) f).useTelekinesis();
            }
            if(f instanceof Steve){
                ((Steve)f).swingsBat();
            }
        }



















    }
}