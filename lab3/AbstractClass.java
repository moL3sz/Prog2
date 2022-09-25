abstract class Animal2 implements FirstInterface {// extends xyz{
    public abstract void animalSound();

    public void Sleep() {
        System.out.println("ZzZzzZzZZz");
    }

    final Integer a = 0;
    final static Integer b = 0;
    Integer c = 0;
    static Integer d = 0;
}

class Pig2 extends Animal2 {
    @Override
    public void method1() {
        System.out.println("Method 1");
        
    }
    @Override
    public void animalSound() {
        System.out.println("Oink!");
        
    }
}

public  class AbstractClass {
    public static void main(String[] args){
        Pig2 p = new Pig2();
        p.Sleep();
        p.animalSound();
    }
}
