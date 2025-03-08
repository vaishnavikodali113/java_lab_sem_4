public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        swimBehaviour  = new SwimWithLegs();
        flyBehaviour = new Fly();
    }
    @Override
    void display() {
        System.out.println("I am mallard duck...");
    }
}
