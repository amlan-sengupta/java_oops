public class Player {
        public String name;
        public int health;
        public String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public int healthRemaining(int damage){
        this.health=this.health-damage;
        if(this.health<0){
            System.out.println("Player knocked out");
            return -1;
        }
        else{
            return this.health;
        }
    }
}
