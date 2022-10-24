public class Asset{
    private final String name;
    private final double value;

    public Asset(String name, double value) {
        this.name = name;
        this.value = value;
    }
    //Method to return the name of the asset
    public String getName(){
        return this.name;
    }
    //Method to return the value of the asset
    public double getValue(){
        return this.value;
    }
}