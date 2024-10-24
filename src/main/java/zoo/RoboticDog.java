package zoo;
//we can implement interface files like this
public class RoboticDog implements IPet{
    @Override
    public void greetOwner() {
        System.out.println("robo bark robo bark");
    }
}
