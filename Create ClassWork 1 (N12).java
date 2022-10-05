import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*განსაზღვრეთ 8 ელემენტიანი მთელ რიცხვთა მასივი, ჩაწერეთ მასში
    შემთხვევითი რიცხვები, დაალაგეთ მასივი კლებადობით, დაბეჭდეთ მასივი.*/

        Random random = new Random();

        double[] arr  = new double[8];

        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextDouble(10, 99.99);
        }

        for (int i=0; i < arr.length; i++){
            System.out.println((arr[i]));
        }


        System.out.println("\n" + "კლების მიხედვით");

        for (int i = arr.length-1; arr.length>=0;  i--){
            System.out.println(arr[i]);
        }

    }
}
