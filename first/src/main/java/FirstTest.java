import test.ship.StarShip;

public class FirstTest {
	
    public static void main (String[] args) {
        //создадим экземпляр класса корабля StarShip
        StarShip ship = new StarShip(16.89);
        displayHigh(ship);

    }
    public static void displayHigh(StarShip ship) {
        System.out.println("Высота корабля составляет : "+ ship.getShipHeight());
    }


}