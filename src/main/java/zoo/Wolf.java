package zoo;

public class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("howwle");
    }

    public Wolf() {
    }

    public Wolf(String name) {
        super(name);
    }

    public Wolf(String name, String food) {
        super(name, food);
    }
}
