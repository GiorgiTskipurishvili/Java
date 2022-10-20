import java.util.Scanner;
public class Class1 {
    /*განსაზღვრეთ კლასი: 3 მთელი ცვლადით x, y, z. 3 მეთოდით.
    a. მეთოდი 1: აბრუნებს 2x-7.
    b. მეთოდი 2: აბრუნებს 3y+z.
    c. მეთოდი 3: აბრუნებს 12y-x+z.*/
    Scanner scan = new Scanner(System.in);
    int x,y,z;

    public int Methodi1(){
//        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ x რიცხვი");
        x=scan.nextInt();
        int answer = 2*x-7;
        return answer;
    }


    public int Methodi2(){
        System.out.println("შეიყვანეთ y და z");
        y = scan.nextInt();
        z = scan.nextInt();
        return 3*y+z;
    }

    public int Methodi3(){
        return 12*y-x+z;
    }


}
