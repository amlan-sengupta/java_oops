//if public declaration is used then the class would not have the control
//if we declare the parameters as public instead of private, then we would need to make changes in all the class it is being used
//the parameters can be exploited


public class EnhancedPlayer {

        private String name;
        private int health;
        private String weapon;

        public EnhancedPlayer(String name, int health, String weapon) {
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


