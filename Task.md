# Homework_Modul7
Задание:
Cоздайте абстрактный класс Animal со строковой переменной name, habitat, логической переменной isVegetarian, вещественными переменными maxWeight, maxGrowth.
Создайте конструктор Animal с параметрами: name, isVegetarian, maxWeight, maxGrowth, habitat.
Создайте абстрактные методы: getName, возвращающий строку; isVegetarian, возвращающий true или false; getMaxWeight, возвращающий вещественное значение; getMaxGrowth, возвращающий вещественное значение; getHabitat,возвращающий строку. 
Создайте интерфейс UseableAsTransport c вещественным параметром maxWeightOfCargo.
Создайте класс Elephant, наследующий Animal, имплементирующий UseableAsTransport; с целочисленной переменной quantityOfTusks; конструктором, с параметрами String name, boolean isVegetarian, double maxWeight, double maxGrowth, String habitat, 
int quantityOfTusks; методами getName, isVegetarian, getMaxWeight, getMaxGrowth, getHabitat, isCanBeUsedAsTransport.
Создайте класс Lion, наследующий Animal; конструктором, с параметрами String name, boolean isVegetarian, double maxWeight, double maxGrowth, String habitat; методами getName, isVegetarian, getMaxWeight, getMaxGrowth, getHabitat.
Создайте Elephant ("Indian elephant", true, 12200.0, 3.2, "India", 2). Используйте метод isCanBeUsedAsTransport(500).
Создайте Lion  ("African lion", false, 250, 1.2, "Africa"). Используйте метод getMaxWeight().
