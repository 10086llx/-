public class Hero {
    public int hp;
    private String name;
    private float armor; //护甲
    private float aggressivity; //攻击力
    public Hero(String name, int hp, float armor, float aggressivity){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.aggressivity = aggressivity;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float gethp(){
        return  hp;
    }
    public void sethp(int hp){
        this.hp = hp;
    }
    public float getarmor(){
        return  armor;
    }
    public void setarmor(float armor){
        this.armor = armor;
    }
    public float getaggressivity(){
        return  aggressivity;
    }
    public void setaggressivity(float aggressivity){
        this.aggressivity = aggressivity;
    }
    public String getHero() {
        return name + "血量" + hp + "攻击"+armor+"防御"+aggressivity;



    }

}

