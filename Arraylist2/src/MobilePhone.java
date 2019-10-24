import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        // Initialize the arrayList as empty in the constructor
        this.myContacts=new ArrayList<Contacts>();
    }
    public boolean addNewContact(Contacts contacts){
        if(findContact(contacts.getName())>=0){
            System.out.println("Already in file");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }
    public void printContacts(){
        for(int i=0;i<myContacts.size();i++){
            System.out.println("#1 Name:"+myContacts.get(i).getName()+" ,Number:"+ myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }
    private int findContact(String contactName){
        for(int i=0;i<this.myContacts.size();i++){
            Contacts contacts=this.myContacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public boolean updateContact(Contacts oldContact,Contacts newContact){
        int foundPositon=findContact(oldContact);
        if(foundPositon<0){
            System.out.println("Not found");
            return false;
        }
        else{
            this.myContacts.set(foundPositon,newContact);
            return true;
        }
    }

    public String queryContact(Contacts contacts) {
        int index = findContact(contacts.getName());
        if (index >= 0) {
            return this.myContacts.get(index).getName();
        } else {
            return "Not found";
        }
    }

    public Contacts queryContact(String name){
        int foundPositon=findContact(name);
        if(foundPositon>=0){
            return myContacts.get(foundPositon);
        }
        else{
            return null;
        }
    }
    public boolean removeContact(Contacts contacts){
        int foundPositon=findContact(contacts);
        if(foundPositon<0){
            System.out.println("Not found");
            return false;
        }
        else{
            this.myContacts.remove(foundPositon);
            return true;
        }
    }
}
