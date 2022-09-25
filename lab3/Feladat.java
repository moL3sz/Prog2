interface I1{


    public void print();

}
interface I2 extends I1{
   public void Sleep();
}
interface I3 extends I1{
    public void Eat();

}

abstract class A1 implements I2, I3{
    @Override
    public void Sleep() {
        System.out.println("zZZzz");
        
    }

}
abstract class A2 extends A1{
    private String name;
    @Override
    public void print() {
        System.out.println(this.name + " beszél");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
class C1 extends A2{
    @Override
    public void Eat() {
        System.out.println(super.getName() + " eszik");
    }
}




public class Feladat {
    public static void main(String[] args){
        C1 c1 = new C1();
        c1.setName("Kristóf");
        c1.Eat();
        c1.Sleep();
        c1.print();
    }
}
