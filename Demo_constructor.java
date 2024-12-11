class Demo_constructor{
    String name;
    int age;

    // Default constructor
    public Demo_constructor(){
        // name = "GHanshyam";
        // age = 16;
        this("Ghanshyam", 16);
        System.out.println("Default constructor called");
    }

    // Parametrized constructor
    public Demo_constructor(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println(name);
        System.out.println(age);
    }

    // main function
    public static void main(String[] args){
        Demo_constructor obj = new Demo_constructor();
    }

}