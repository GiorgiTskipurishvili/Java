import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაალაგეთ მასივი
        ზრდადობით, დაბეჭდეთ მასივი.*/

        double[] masivi = new double [] {98.09, 87, 66.69, 9.33, 3.12, 99.99,50.55, 10.72};

        Arrays.sort(masivi);

        for (int i = 0; i < masivi.length; i++){
                System.out.println(masivi[i]);
            }
        }

}
