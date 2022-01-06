public class Elephant extends Animal implements UseableAsTransport {
    int quantityOfTusks;

    public Elephant(String name, boolean isVegetarian, double maxWeight, double maxGrowth, String habitat,
                    int quantityOfTusks) {
        super(name, isVegetarian, maxWeight, maxGrowth, habitat);
        this.quantityOfTusks = quantityOfTusks;
    }

    @Override
    public String getName() {
        System.out.println("Name of the Elephant is " + name);
        return name;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getMaxWeight() {
        System.out.println("Max weight of " + name + " is " + maxWeight);
        return maxWeight;
    }

    @Override
    public double getMaxGrowth() {
        System.out.println("Max growth of " + name + " is " + maxGrowth);
        return maxGrowth;
    }

    @Override
    public String getHabitat() {
        System.out.println("Elephant habitat is " + habitat);
        return habitat;
    }

    @Override
    public boolean isCanBeUsedAsTransport(double maxWeightOfCargo) {
        System.out.println(name + " can be used as transport with the maximum weight of cargo " +
                maxWeightOfCargo+" kg.");
        return true;
    }
}
