
public class Case {
    private String model;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
