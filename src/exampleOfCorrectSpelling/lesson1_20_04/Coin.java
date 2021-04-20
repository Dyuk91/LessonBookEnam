package exampleOfCorrectSpelling.lesson1_20_04;

/*

Проверка корректности входящей извне информации осуществляется в ме-
тоде setDiameter(double value) и позволяет уведомить о нарушении инициали-
зации объекта. Доступ к public-методам объекта класса осуществляется только
после создания объекта данного класса.

 */

public class Coin {

    private double diameter; // правильная инкапсуляция
    private double weight; // правильная инкапсуляция

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {

        if (value >0){
            diameter=value;
        }else{
            System.out.println("Отрицательный диаметр!");
        }
    }

    public double getWeight() { // правильное имия метода
        return weight;
    }

    public void setWeight(double value) {
        weight = value;
    }
}
