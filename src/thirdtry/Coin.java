package thirdtry;

public class Coin {
    private double diameter; // правильная инкапсуляция
    private double weight; // правильная инкапсуляция
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double value) {
        if(value > 0) {
            diameter = value;
        } else {
            System.out.println("Oтрицательный диаметр!");
        }
    }
    public double getWeight() { // правильное имя метода
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }
}
