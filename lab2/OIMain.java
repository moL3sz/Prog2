import java.util.Scanner;

class OuterClass{
    private int x = 1;
    private String t1;

    class InnerClass{
        private int y = 2;
        private String t2;
        
        public void setT2(String newT2){
            this.t2 = newT2;
        }
        public String getT2(){
            return this.t2;
        }
    }
    public void setT1(String newT1){
        this.t1 = newT1;
    }
    public String getT1(){
        return this.t1;
    }

}




public class OIMain{
    public static void main(String args[]){
        OuterClass oc  = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        Scanner scanner = new Scanner(System.in);
        oc.setT1(scanner.nextLine());
        ic.setT2(scanner.nextLine());

        System.out.println(oc.getT1() + ic.getT2());
        scanner.close();

    }
}