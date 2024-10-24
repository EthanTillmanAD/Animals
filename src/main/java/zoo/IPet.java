package zoo;

public interface IPet{

    public abstract void greetOwner();

   default void printPetClassName(){// default method -
       // this will make it to where you dont have to change all classes that imploment this method
       System.out.println(this.getClass().getSimpleName());
   }

   //Static methods
static void  printPetGreeting(IPet[] pets){
    for (IPet pet : pets){
        pet.printPetClassName();
        pet.greetOwner();

    }
}




}
