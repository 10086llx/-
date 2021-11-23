 public class LAttack implements Attack {
    public static void attack(Hero hero) {
        System.out.println(hero.getName() + "造成了" + hero.getarmor() + "伤害");
    }
}
