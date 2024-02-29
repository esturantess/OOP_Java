package Sem2_HW2.task2;
import Sem2_HW2.task1.*;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
