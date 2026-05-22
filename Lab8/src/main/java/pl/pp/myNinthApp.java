package pl.pp;

public class myNinthApp {

    public static void main(String[] args) {
        Warehouse myWarehouse = new Warehouse("WH-999", 5000, "Adilet Akzholov", "adiletakzholov5@gmail.com", "+48123456789");

        myWarehouse.addGoods(3000);
        myWarehouse.removeGoods(1000);
        myWarehouse.addGoods(2500);

        myWarehouse.checkOccupancy();
    }
}