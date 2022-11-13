import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget {
    private int money;


    public void  setMoney(int money){
        this.money = money;
    }

    public void changeMoney(int money){
        this.money = +money;
    }

    public int getMoney(){
        return this.money;
    }

    public int familySituation(){
        if (this.money >= 40000){
            System.out.println("Rich");
        } else if (this.money>=10000 && this.money < 40000) {
            System.out.println("Middle");
        }else{
            System.out.println("Poor ");
        }
        return this.money;
    }

    void famBudgMon() throws IOException{
//        FileWriter wr = new FileWriter("Budget.txt", true);
//        try {
//            wr.write(familySituation());
//            wr.close();
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Budget.txt"));
            if (this.money >= 40000){
                writer.write("Rich");
            } else if (this.money>=10000 && this.money < 40000) {
                writer.write("Middle");
            }else {
                writer.write("poor");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
































//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FamilyBudget {
//    private static int money;
//
//
//    public void  setMoney(int money){
//        this.money = money;
//    }
//
//    public void changeMoney(int money){
//        this.money = +money;
//    }
//
//    public int getMoney(){
//        return this.money;
//    }
//
////    public FamilyBudget(int money) {
////        this.money = money;
////    }
//
//    public static String familySituation(){
//
//        if (money >= 40000){
//            return "Rich";
//        } else if (money>=10000 && money < 40000) {
//            return "Middle";
//        }else{
//            return "Poor ";
//        }
//
//    }
//
//    public static void famBudgMon() throws IOException{
//        FileWriter wr = new FileWriter("Budget.txt", true);
//        try {
//            wr.write(familySituation());
//            wr.close();
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//
//
//
//    }
//
//}

