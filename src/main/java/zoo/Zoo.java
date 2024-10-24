package zoo;

public class Zoo {

    public static void main(String[] args) {
      //  Animal animal1 = new Animal("leo the Lion" ,  "Juicy Steaks");
//        animal1.name = "Leo the Lion";
//        animal1.food = "Juicy Steaks";
       // animal1.age = 12;
        //animal1.eat();
      //  System.out.println(animal1);// no need to put .toString();

      //  Animal animal2 = new Animal("Cow" , "Grass");
        //animal2.name = "Cow";
        ///animal2.food = "Grass";
      //  animal2.age = -99;
      //  animal2.setAge(99);
       // animal2.eat();
      //  System.out.println(animal2.getAge());
      //  System.out.println(animal2);

        Cat cat = new Cat("cattie", "Milk and fish");// created on the heap
        System.out.println(cat);
        cat.setAge(4);
        Dog dog = new Dog("bingo", "bones");

        Animal dogToCat = new Dog("Dog_ah_Cat", "noodles");
        Animal catToDog = new Cat("fluffie", "soemfood");
    //this is up casting^^^

        //        System.out.println(dogToCat instanceof Cat);

        ((Dog)dogToCat).fetch();// downcasted from parent to super

        ((Cat)catToDog).scratch();
//         ^casting

        dog = new Dog("fido");

        System.out.println(dog);
        dog.setAge(9);

        dog.sex = 'F';
        //dog.fetch();
        //cat.scratch();
        System.out.println(cat.getId());

      //  System.out.println(cat);
      //  System.out.println(dog);

        Wolf wolf = new Wolf("dormax", "Deer");
      //  System.out.println(wolf);
        System.out.println(dog.getId());
        Tiger tiger = new Tiger("Tigress", "Aligators");
      //  System.out.println(tiger);
        //Casting with objects
        Animal.printUniqueAnimalMethod(cat);
        RoboticDog roboticDog = new RoboticDog();
        IPet[] pets = {roboticDog,dog,cat};

        Animal[] animals = {dog, cat, wolf, tiger};
        //Animals can be used for an array of objects but cant make its own objects

      //  // System.out.println("Animals in zoo: " + Animal.getAnimalCount());
//        for (Animal animal : animals){
//            animal.eat();
//            animal.makeNoise();
//            System.out.println(animal.getId());
//
//        }
       IPet.printPetGreeting(pets);



    }

}
