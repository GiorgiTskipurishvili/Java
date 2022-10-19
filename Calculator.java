import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1)	ააგეთ კონსოლური კალკულატორი, რომელიც შეასრულებს მინიმუმ ოთხ ოპერაციას +, -, *, /,^-ს ორ რიცხვზე,
        // ახარისხების ^ ოპერაციას, დაამატეთ ორზე მეტ რიცხვზე მოქმედების ჩატარება, დაამატეთ ფრჩხილები,
        // დაამატეთ ფესვის ამოღების ოპერაცია.

        System.out.println("აირჩიეთ ქვემოთ ჩამოთვლილთაგან");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. ^");
        System.out.println("6. x*y+z");
        System.out.println("7. x*(y+z)");
        System.out.println("8. ფასვიდან ამოღება");
        int choose =scan.nextInt();



        if (choose == 1){
            System.out.println("პასუხი არის " + version1() );
        } else if (choose == 2) {
            System.out.println("პასუხი არის " + version2() );
        } else if (choose == 3) {
            System.out.println("პასუხი არის " + version3() );
        } else if (choose == 4) {
            System.out.println("პასუხი არის " + version4() );
        } else if (choose == 5) {
            System.out.println("პასუხი არის " + version5() );
        }else if (choose == 6) {
            System.out.println("პასუხი არის " + version6() );
        }else if (choose == 7) {
            System.out.println("პასუხი არის " + version7() );
        }else if (choose == 8) {
            System.out.println("პასუხი არის " + version8() );
        }else{
            System.out.println("თქვენს მიერ არჩეული ვერსია არ მოიძებნა");
        }


    }


    //add
    public static int version1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ ორი რიცხვი");
        int x = scan.nextInt();
        int y = scan.nextInt();
        return x+y;
    }

    //sub
    public static int version2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ ორი რიცხვი");
        int x = scan.nextInt();
        int y = scan.nextInt();
        return x-y;
    }


//    mull
    public static int version3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ ორი რიცხვი");
        int x = scan.nextInt();
        int y = scan.nextInt();
        return x*y;
    }

//    div
    public static int version4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ ორი რიცხვი");
        int x = scan.nextInt();
        int y = scan.nextInt();
        return x/y;
    }

    //pow
    public static int version5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ ორი რიცხვი");
        int x = scan.nextInt();
        int y = scan.nextInt();
        return (int) Math.pow(x,y);
    }

    public static int version6(){
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ სამი რიცხვი");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        return x*y+z;
    }

    public static int version7(){
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ სამი რიცხვი");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        return x*(y+z);
    }

    public static double version8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ ნებისმიერი რიცხვი ");
        int k = scanner.nextInt();
        return Math.sqrt(k);
    }
}
