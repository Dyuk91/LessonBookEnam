package exampleOfMisspelling;

public class Example_20_04_Coin {

    /*

    Класс Coin содержит два поля diameter и weight, помеченные как public
и private. Значение поля weight можно изменять только при помощи методов,
например, setWeight (double value). В некоторых ситуациях замена некоррект-
ного значения на значение по умолчанию может привести к более грубым
ошибкам в дальнейшем, поэтому часто вместо замены производится генерация
исключения. Поле diameter доступно непосредственно через объект класса
Coin. Поле, объявленное таким способом, считается объявленным с наруше-
нием «тугой» инкапсуляции, следствием чего может быть нарушение коррект-
ности информации, как это показано ниже:

     */

    public double diameter; // нарушение инкапсуляции
    private double weight; // правильная инкапсуляция

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {

                if (value > 0){
                    diameter=value;
                }else{
                    diameter = 0.01; // значение по умолчанию
                }
    }

    public double takeWeight() { // некорректно : неправилное имя метода
        return weight;
    }

    public void setWeight(double value) {
        weight = value;
    }
}
