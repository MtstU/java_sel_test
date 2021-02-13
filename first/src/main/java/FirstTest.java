import test.ship.StarShip;

public class FirstTest {
	
    public static void main (String[] args) {
        //создадим экземпляр класса корабля StarShip
        StarShip ship = new StarShip();

        //Зададим кораблю свойство-высоту
        ship.shipHeight = 258.28;
        displayHigh(ship);

    }
    public static void displayHigh(StarShip ship) {
        System.out.println("Высота корабля составляет : "+ getStarShipHeight(ship));
    }

    public static double getStarShipHeight(StarShip ship) {
        return ship.shipHeight;
    }

}