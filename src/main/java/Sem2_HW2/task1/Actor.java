package Sem2_HW2.task1;

public abstract class Actor implements ActorBehaviour{

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

}
