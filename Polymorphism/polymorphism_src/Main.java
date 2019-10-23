class Movie{
    private String name;
    public Movie(String name){
        this.name=name;
    }
    public String plot(){
        return "No plot found";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Shark eat people";
    }
}

class Independence extends Movie{
    public Independence(){
        super("Independence");
    }

    @Override
    public String plot(){
       return  "Aliens take over planet";
    }
}
class Maze extends Movie{
    public Maze(){
        super("MazeRunner");
    }
    //no plot
    //as it extends from movie so java goes to higher class.
}


public class Main {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie #"+i+" :"+movie.getName()+",plot:"+movie.plot());
        }
    }
    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random()*3)+1;
        System.out.println("randomNumber:"+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new Independence();

            case 3:
                return new Maze();

        }
        return null;
    }
}
