package Sem2_HW2.task2;
import Sem2_HW2.task1.*;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Артур Виноградов");
        Human human2 = new Human("Винограда Артурова");
        Human human3 = new Human("Саша Булк");

        Market perekrestok = new Market();
        perekrestok.acceptToMarket(human1);
        perekrestok.acceptToMarket(human2);
        perekrestok.acceptToMarket(human3);
        perekrestok.update();


    }
}
