abstract public class Animal {
    String name;
    boolean isVegetarian;
    double maxWeight;
    double maxGrowth;
    String habitat;

    public Animal(String name, boolean isVegetarian, double maxWeight, double maxGrowth, String habitat) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.maxWeight = maxWeight;
        this.maxGrowth = maxGrowth;
        this.habitat = habitat;
    }


    abstract public String getName();

    abstract public boolean isVegetarian();

    abstract public double getMaxWeight();

    abstract public double getMaxGrowth();

    abstract public String getHabitat();
}
