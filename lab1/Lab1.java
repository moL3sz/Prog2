
/*
 * 
 * Java alapok
 */
class Lab1 extends Object {


    protected final static void method1(){
        System.out.println("Indul a jobbhorog");
    }

    public static void main(String[] args) {

        // primitv tipusok
        int a = 5;
        float t = 2.23f;
        final char k = 'a';

        // öszetett
        String hello = "Hello wolrd";
        Integer a1 = 10;
        Character c1 = 'k';
        Float bij = 2.1f;

        // random number gen

        int r = (int) (Math.random() * 101);
        System.out.println(r);
   
        method1();
    }

}