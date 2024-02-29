package Sem2_HW2.task2;
import Sem2_HW2.task1.*;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
