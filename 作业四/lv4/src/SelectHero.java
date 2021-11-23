public class SelectHero {
    public static void main(String[] args) {
        Hero kw = new Hero("凯文", 1000,28,25);
        Hero l = new Hero("狼", 600,30,20);
        Hero NS=new  Hero("纳什",999999,99999,999999 );
        KwAttack kwAttack = new KwAttack();
        LAttack lAttack = new LAttack();
        Boss NSAttack = new Boss();
        int a= (int) (kw.hp- l.getarmor());
        int b= (int) (l.hp- kw.getarmor());
        while (a>=0&&b>=0){
            a = (int) (a - l.getarmor());
            b=(int) (b- kw.getarmor());
            kwAttack.attack(kw);
            LAttack.attack(l);
            if(0>=a) {
                System.out.println(l.getName() + "杀死了" + kw.getName());
                break;
            } else if(0>=b){
                System.out.println( kw.getName() + "杀死了" + l.getName());
        }
    } System.out.println( kw.getName() + "还有" + a+"滴血");
        NSAttack.attack(NS);
        a=(int) (a- a);
        System.out.println( kw.getName() + "还有" + a+"滴血");
        System.out.println( kw.getName() + "已经阵亡" );
        System.out.println(                        );
        System.out.println(                        );
        System.out.println(                        );
        System.out.println(                        );
        System.out.println(  "你甘心吗？" );
        System.out.println(  "你是否想要获得力量？" );
        System.out.println(  "向我献上你的灵魂，我将给予你力量！！！" );
        System.out.println( kw.getName() + "复活了" );
        int c=(int) (NS.gethp() -NS.gethp() );
        System.out.println( NS.getName() + "剩余"+c +"滴血量" );
        System.out.println( NS.getName() + "死亡");

    }}



