public class Contacts {
    //create this class first
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //IMPORTANT TO CREATE A NEW CONTACT
    public static Contacts createContact(String name,String phoneNumber){
        return new Contacts(name,phoneNumber);
    }
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
