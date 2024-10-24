package zoo;

public class Tiger extends Feline implements IPet, Endangered{
    @Override
    public void makeNoise() {
        System.out.println("roar in tiger style");
    }

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }

    public Tiger(String name, String food) {
        super(name, food);
    }

    @Override
    public void greetOwner() {
        System.out.println("Greets tiger style");
    }

    @Override
    public boolean isEndangered() {
        return false;
    }
}
