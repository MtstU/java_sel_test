package test.ship;
/*Created by Michael but not Jackson 02 2021*/

public class StarShip {
    //зададим переменную- высоту
    public double shipHeight;

    //добавляем консруктор для корабля
    //сеттер- устанавливает значение

    public StarShip(double shipHeight) {
        this.shipHeight = shipHeight;
    }

    //геттер - возвращает значение

    public double getShipHeight() {
        return this.shipHeight;
    }
}
