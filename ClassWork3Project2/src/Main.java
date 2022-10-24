public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClassA cA = new ClassA();

        cA.Methodi1();
        System.out.println("აბრუნებს a და b ცვლადებს " + cA.Methodi2());
        System.out.println("აბრუნებს a და b ცვლადების სიმბოლოებს " + cA.Methodi3());
        cA.Methodi4();
        System.out.println("ლუწებია");
        cA.Methodi5();
        System.out.println("დადებითი რიცხვების ჯამია ");
        cA.Methodi6();
        System.out.println("მინიმალური დადებითი m რიცხვი მასივში");
        cA.Methodi7();
    }
}