package Папка;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Василий\t");
        Human human2 = new Human("Петр\t");
        Human human3 = new Human("Николай\t");
        Human human4 = new Human("Виктор\t");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();
        while (!market.checkActorInMarket()) {
            market.update();
        }
    }
}