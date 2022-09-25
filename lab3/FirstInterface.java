interface FirstInterface {
    public void method1();


}
interface SecondInterface{
    public void method2();
}

//abstract
class DemoClass implements FirstInterface, SecondInterface{
    @Override
    public void method1(){
        System.out.println("Method 1");
    }
    @Override
    public void method2(){
        System.out.println("Method 2");
    }

}


class InterfaceDemo {
    public static void main(String args[]){
        DemoClass dc = new DemoClass();
        dc.method1();
        dc.method2();
    }
}