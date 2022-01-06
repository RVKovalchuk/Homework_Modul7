public class Lion extends Animal{


    public Lion(String name, boolean isVegetarian, double maxWeight, double maxGrowth, String habitat) {
        super(name, isVegetarian, maxWeight, maxGrowth, habitat);
    }

    @Override
    public String getName() {
        System.out.println("Name of the Lion is " + name);
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
        System.out.println("Lion habitat is " + habitat);
        return habitat;
    }
}
