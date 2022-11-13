import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

//
//        FamilyBudget fam1 = new FamilyBudget(50000);
////        fam1.changeMoney(500);
//        String famSituation = fam1.familySituation();
//        System.out.println(famSituation);
//        System.out.println(fam1.getMoney());
//        fam1.famBudgMon(famSituation);


//        ClassA cA = new ClassA();
//        cA.Methodi1();
//        System.out.println("Jami " + cA.Methodi2());
//        System.out.println("Namravli " + cA.Methodi3());
//        System.out.println("");
//        cA.Methodi4();

        ClassB cB = new ClassB();
        cB.Methodi1();
        System.out.println(cB.Methodi2());
        System.out.println(cB.Methodi3());
        cB.Methodi4();


    }
}