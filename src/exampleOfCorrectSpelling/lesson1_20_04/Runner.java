package exampleOfCorrectSpelling.lesson1_20_04;

public class Runner {
    public static void main(String[] args) {
      Coin obj1 = new Coin();
      obj1.setDiameter(-0.11); //
      obj1.setDiameter(0.12); //
        obj1.setWeight(150);

        Coin obj2 = new Coin();
        obj2.setDiameter(0.21);
        obj2.setWeight(170);

        CompareCoin ca = new CompareCoin();
        ca.compareDiameter(obj1,obj2);
    }
}
