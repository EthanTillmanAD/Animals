package zoo;

public class Cat extends Feline implements IPet {
    public boolean hasNineLives;


    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, String food) {
        super(name, food);
    }

    public void scratch(){

        System.out.println("I Scratch things");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow Meow");
    }

    @Override
    public void greetOwner() {
        System.out.println("rubs up against owner");
    }
}
