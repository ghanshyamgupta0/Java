class Animal{
    int a,b;
    void getdata(int a, int b){
        this.a = a;
        this.b = b;
    }
}
class Dogs extends Animal{
    int add(){
        return a + b;
    }
    void display(){
        System.out.println("Value  of A = "+a);
        System.out.println("Value of B = "+b);
    }
}

public class Inheritance{
    public static void main(String[] args){
        Dogs d1 = new Dogs();
        d1.getdata(10, 20);
        int s = d1.add();
        System.out.println("Sum is "+s);
        d1.display();
    }
}