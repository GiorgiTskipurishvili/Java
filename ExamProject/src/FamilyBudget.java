import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget {
    private int money;

    public FamilyBudget(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void changeMoney(int money){
        this.money = money;
    }

    public String familySituation(){

        if (money>=10000 && money < 40000){
            return "Middle";
        } else if (money >= 40000) {
            return "Rich";
        }else{
            return "Poor ";
        }

    }

    public void famBudgMon(String famSituation) throws IOException{
        File file = new File("Budget.txt");
        FileWriter wr = new FileWriter(file);
        try {
            String data = famSituation + "\n" + money;
            wr.write(data);
            wr.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

}