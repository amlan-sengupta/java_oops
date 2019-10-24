import java.util.LinkedList;
import java.util.ListIterator;

public class Places {
    private LinkedList<String> places=new LinkedList<>();

    public void addPlaces(String name) {
        if (foundPlace(name)>=0) {
            System.out.println("Already existing");;
        } else {
            places.add(name);
        }
    }

    public void removePlaces(String name) {
        int index=foundPlace(name);
        if (index>=0) {
                places.remove(index);
        }
        else{
            System.out.println("not found");
        }
    }


    private int foundPlace(String name){
        for(int i=0;i<places.size();i++){
            if((places.get(i)).equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void printList(){
        int j=1;
        ListIterator<String> i=places.listIterator();
        while(i.hasNext()){
            System.out.println("Place no.#"+j+" "+ i.next());
            j++;
        }
    }
    public String visitPrev(String name){
        int index=foundPlace(name);
        if(index==0){
            return "We are at starting can't go back";
        }
        else{
            return places.get(index-1);
        }
    }
    public String visitNext(String name){
        int index=foundPlace(name);
        if(index==places.size()-1){
            return "We are at end can't go forward";
        }
        else{
            return places.get(index+1);
        }
    }

}
