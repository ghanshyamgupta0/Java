class Animal{
    String name;

    // Constructor
    public Animal(String name){
        this.name = name;
    }

    // Mathod
    public void eat(){
        System.out.println(name+" is eating");
    }
}
class Dogs extends Animal{
    String breed;

    // Constructor
    public Dogs(String name, String breed){
        super(name);
        this.breed = breed;
    }

    // Method
    public void bark(){
        System.out.println(name+" is barking");
    }

    // Main method
    public static void main(String[] args){
        Dogs obj = new Dogs("Tommy", "Shephad");
        obj.eat();
        obj.bark();
        System.out.println(obj.breed+ " is the breed of dog");
    }

}