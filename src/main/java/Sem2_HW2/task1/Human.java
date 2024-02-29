package Sem2_HW2.task1;

public class Human extends Actor implements ActorBehaviour{
    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder() {
        this.isMakeOrder = !this.isMakeOrder;
    }

    @Override
    public void setTakeOrder() {
        this.isTakeOrder = !this.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }


    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
