public class Boss implements Attack{
    public void attack(Hero hero) {
        System.out.println(hero.getName() + "造成了" + hero.getarmor() + "伤害");
}}
