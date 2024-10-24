package zoo;

public abstract class Feline extends Animal {

    // all this class does is group feline animals, Animals can't make animals here
//

    public Feline() {
    }

    public Feline(String name) {
        super(name);
    }

    public Feline(String name, String food) {
        super(name, food);
    }
}
