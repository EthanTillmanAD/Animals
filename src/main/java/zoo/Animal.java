package zoo;
//Every object has - id,State,Behavior

public abstract class Animal {
    //State
    private int id;
  private String name;
    private String food;
    private int age;
protected char sex;
private static int animalCount;

    // default constructor
    public Animal(){}

    //parameterized constructor
    public Animal(String name){
        this.name = name;

    }

    //overload the constructor
    public Animal(String name, String food){
        this(name);// this does the same just chains both constructors together
        this.food = food;
        animalCount++;
        id += animalCount;
    }


    public abstract void makeNoise(); //abstract Method

    //Static method / polymorphic method
    public static void printUniqueAnimalMethod(Animal animal){
        if(animal instanceof Dog){
            ((Dog) animal).fetch();
        }if(animal instanceof Cat){
            ((Cat) animal).scratch();
        }
    }



    //Method - behavior - action
    public void eat(){
        System.out.println(this.name + " eats: " + this.food );
    }

//    @Override
//    public String toString(){
//
//        return " -> Name: " + this.name + "\n -> Eats: " + this.food
//                + "\n -> Age: " + this.age + " years old\n";
//
//    }

    public int getAge(){

        return this.age;
    }

    public void setAge(int age) {// encapsulation - Getter/Setter

       if(age >= 0){
        this.age = age;
    }else {
           System.out.println("Age can't be negative");
       }
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public int getId() {// this will return the id number/ which number this was created
        return id;
    }

    public static int getAnimalCount() {//counts all animals made
        return animalCount;
    }
}
