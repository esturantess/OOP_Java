package Sem2_HW2.task2;

import Sem2_HW2.task1.*;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    protected List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Покупатель " + actor.getName() + " зашёл(ла) в магазин.");
        System.out.println();
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            queue.remove(actor);
            System.out.println(actor.getName() + " вышел(ла) из магазина.");
        }
    }

    @Override
    public void update() {
        takeOrders();
        System.out.println();
        giveOrders();
        System.out.println();
        releaseFromQueue();
        System.out.println();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println("Покупатель " + actor.getName() + " встал(а) в очередь.");
        System.out.println();
    }

    @Override
    public void takeOrders() {
        for (Actor actor: queue) {
            if (!actor.isTakeOrder()){
                actor.setTakeOrder();
                System.out.println("Покупатель " + actor.getName() + " сделал(а) заказ.");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor: queue) {
            if (!actor.isMakeOrder()){
                actor.setMakeOrder();
                System.out.println("Покупатель " + actor.getName() + " получил(а) заказ.");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println("Покупатель " + actor.getName() + " вышел(а) из очереди.");
            }
        }
        System.out.println();
        releaseFromMarket(releaseActors);
    }

}
