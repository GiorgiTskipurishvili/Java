import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, ჩაწერეთ მასში
        შემთხვევითი რიცხვები, დაბეჭდეთ მასივი.*/

        Random random = new Random();

        double[] arr  = new double[8];

        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextDouble(10, 99.99);
        }

        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
