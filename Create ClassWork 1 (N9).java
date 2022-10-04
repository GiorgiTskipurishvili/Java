public class Main {
    public static void main(String[] args) {
        /*განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაბეჭდეთ მასივის
    ელემენტები, მასივის უდიდესი და უმცირესი ელემენტი.*/


        double[] masivi = new double [] {98.09, 87.23, 66.69, 9.33, 3.12, 99.99,50.55, 10.72};

        double max = masivi[0];
        double min = masivi[0];

        for (int i = 0; i < masivi.length; i++){
            if (masivi[i]> max){
                max = masivi[i];
            }
        }

        for (int i = 0; i< masivi.length; i++){
            if (masivi[i] < min){
                min = masivi[i];
            }
        }

        System.out.println("მაქსიმუმი: " + max);
        System.out.println("მინიმუმი: "+ min);

    }
}
