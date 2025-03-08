public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Drown();
        flyBehaviour = new NotFly();
    }

    @Override
     void display() {
        System.out.println("I’m a Decoy Duck!");
    }
}
