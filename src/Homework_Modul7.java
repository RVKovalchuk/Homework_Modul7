public class Homework_Modul7 {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Indian elephant", true, 12200.0, 3.2, "India", 2);
        elephant.isCanBeUsedAsTransport(500);
        Lion lion = new Lion("African lion", false, 250, 1.2, "Africa");
        lion.getMaxWeight();
    }
}
