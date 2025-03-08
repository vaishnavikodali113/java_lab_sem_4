public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehaviour = new Squeak();
        swimBehaviour  = new Floating();
        flyBehaviour = new NotFly();
    }

    @Override
    void display() {
        System.out.println("I am a Rubber duck");
    }
}
