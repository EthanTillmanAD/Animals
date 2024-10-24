package zoo;
// Dog Is-A animal
public class Dog extends Canine implements HouseHoldPet{

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String food) {
        super(name, food);
    }

    public void fetch(){
        System.out.println("Fetch a toy ball like a " + sex);
    }
//    @Override
//    public String toString(){
//
//        return " -> Name: " + getName() + "\n -> Eats: " + getFood()
//                + "\n -> Age: " + getAge() + " years old\n" + " -> Sex: " + this.sex + "\n";
//
//    }

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }

    @Override
    public void greetOwner() {
        System.out.println("wag tail and lick owner");
    }

    @Override
    public void play() {
        System.out.println("playing");
    }
}
