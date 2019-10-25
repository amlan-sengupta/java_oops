public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    //print the overview of the object

    @Override
    public String toString() {
        return this.title+" "+this.duration;
    }
}
