public class Main {
    public static void main(String[] args) {
        Player player=new Player("Tim",20,"Sword");
        player.healthRemaining(30);
        player.getHealth();

        player.health=200;
        //we are able to modify the health
        System.out.println(player.getHealth());
        System.out.println();


        EnhancedPlayer enhancedPlayer=new EnhancedPlayer("Rob",67,"Gun");
        System.out.println(enhancedPlayer.getHealth());
        enhancedPlayer.healthRemaining(7);
        //enhancedPlayer.health=89;//because of private declaration
        System.out.println(player.getHealth());
    }
}
