abstract class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour; //object of QuackBehaviour
    FlyBehaviour flyBehaviour;

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    
    abstract void display();

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}
