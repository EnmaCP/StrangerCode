import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Fighter> party = new ArrayList<>();
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
        }



    }
}