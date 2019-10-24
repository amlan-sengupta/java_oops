import java.util.ArrayList;

//add, print ,get ,modify ,search, remove
public class GroceryList {
    private ArrayList<String> groceryList=new ArrayList<>();

    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have:"+ groceryList.size()+" items in your list.");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+"."+groceryList.get(i));
        }
    }

    public void modify(String oldName,String newName){
        int pos=position(oldName);
        if(pos>=0){
            groceryList.set(pos,newName);
        }
        else{
            System.out.println(oldName+" Not found");
        }
    }

    public void remove(String name){
        int pos=position(name);
        if(pos>=0){
            groceryList.remove(name);
        }
        else{
            System.out.println("Name not found");
        }
    }
    public void remove(int index){
        groceryList.remove(index);
    }

    private int position(String name) {
        for(int i=0;i<groceryList.size();i++){
            if(groceryList.get(i).equals(name)){
                return i;
            }
        }
        return -1;
        //return groceryList.indexOf(name)
    }

    public void searchItem(String name) {
        int pos = position(name);
        if (pos > 0) {
            System.out.println("Found at" + pos);
        } else {
            System.out.println("Not found");
        }
    }
}
